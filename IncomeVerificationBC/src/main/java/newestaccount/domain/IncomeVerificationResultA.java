package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.IncomeVerificationBcApplication;
import newestaccount.domain.IncomeVerifiedE;

@Entity
@Table(name = "IncomeVerificationResultA_table")
@Data
public class IncomeVerificationResultA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String custNo;

    private String verifyResult;

    private Long incomeAmount;

    private String phoneNo;

    private Long appId;

    @PostPersist
    public void onPostPersist() {
        IncomeVerifiedE incomeVerifiedE = new IncomeVerifiedE(this);
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("IncomeVerificationResultA.java statusUpdateP(incomeVerifiedE )호출 ");
        System.out.println("------------------------------------------------------------------------") ;	

        incomeVerifiedE.publishAfterCommit();
    }

    public static IncomeVerificationResultARepository repository() {
        IncomeVerificationResultARepository incomeVerificationResultARepository = IncomeVerificationBcApplication.applicationContext.getBean(
            IncomeVerificationResultARepository.class
        );
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("IncomeVerificationResultA.java statusUpdateP(IncomeVerificationResultARepository)호출 ");
        System.out.println("------------------------------------------------------------------------") ;	

        return incomeVerificationResultARepository;
    }
     
    public static void incomeVerify(CustomerRegisteredE customerRegisteredE) {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("IncomeVerificationResultA.java statusUpdateP(incomeVerify)호출 ");
        System.out.println("------------------------------------------------------------------------") ;	
        /** Example 1:  new item 
        IncomeVerificationResultA incomeVerificationResultA = new IncomeVerificationResultA();
        repository().save(incomeVerificationResultA);

        IncomeVerifiedE incomeVerifiedE = new IncomeVerifiedE(incomeVerificationResultA);
        incomeVerifiedE.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(customerRegisteredE.get???()).ifPresent(incomeVerificationResultA->{
            
            incomeVerificationResultA // do something
            repository().save(incomeVerificationResultA);

            IncomeVerifiedE incomeVerifiedE = new IncomeVerifiedE(incomeVerificationResultA);
            incomeVerifiedE.publishAfterCommit();

         });
        */

    }
}
