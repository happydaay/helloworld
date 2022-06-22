package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.CustomerRegistrationBcApplication;
import newestaccount.domain.CustomerRegisteredE;

@Entity
@Table(name = "CustomerA_table")
@Data
public class CustomerA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realResNo;

    private String custNm;

    private String phoneNo;

    private String custNo;

    @PostPersist
    public void onPostPersist() {
        CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(this);
        customerRegisteredE.publishAfterCommit();

        System.out.println("-----고객생성-------------------------------------------------------------------") ;
        System.out.println("----CustomerA.java onPostPersist 호출 ");
        System.out.println("----POST 호출시 발생하는 거래 ");
        System.out.println("------------------------------------------------------------------------") ;
    }

    public static CustomerARepository repository() {
        CustomerARepository customerARepository = CustomerRegistrationBcApplication.applicationContext.getBean(
            CustomerARepository.class
        );

        System.out.println("-----고객생성-------------------------------------------------------------------") ;
        System.out.println("----CustomerA.java CustomerARepository repository()  호출 ");
        System.out.println("------------------------------------------------------------------------") ;
        return customerARepository;
    }

    public static void customerRegistP(PreAppliedE preAppliedE) {

        System.out.println("-----고객생성-------------------------------------------------------------------") ;
        System.out.println("----CustomerA.java  customerRegistP(PreAppliedE preAppliedE)호출 ");
        System.out.println("----고객생성 Policy 호출시 발생 거래 ");
        System.out.println("------------------------------------------------------------------------") ;
        
        /** Example 1:  new item 
        CustomerA customerA = new CustomerA();
        repository().save(customerA);

        CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(customerA);
        customerRegisteredE.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(preAppliedE.get???()).ifPresent(customerA->{
            
            customerA // do something
            repository().save(customerA);

            CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(customerA);
            customerRegisteredE.publishAfterCommit();

         });
        */

    }
}
