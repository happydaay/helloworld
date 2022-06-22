package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.PreApplicationBcApplication;
import newestaccount.domain.PreAppliedE;

@Entity
@Table(name = "PreApplicationA_table")
@Data
public class PreApplicationA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realResNo;

    private String custNm;

    private String phoneNo;

    private String appliedStatus;

    private String custNo;

    @PostPersist
    public void onPostPersist() {
        PreAppliedE preAppliedE = new PreAppliedE(this);
        preAppliedE.publishAfterCommit();

        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain PreApplicationA.java onPostPersist");
        System.out.println("------------------------------------------------------------------------") ;


    }

    

    public static PreApplicationARepository repository() {
        PreApplicationARepository preApplicationARepository = PreApplicationBcApplication.applicationContext.getBean(
            PreApplicationARepository.class
        );

        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain PreApplicationA.java public static PreApplicationARepository repository() ");
        System.out.println("------------------------------------------------------------------------") ;

        return preApplicationARepository;
    }

    public static void statusUpdateP(CustomerRegisteredE customerRegisteredE) {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("PreApplicationA.java statusUpdateP(CustomerRegisteredE customerRegisteredE)호출 ");
        System.out.println("CustomerRegisteredE 이벤트로 들어온 입력값" ); 
        System.out.println("customerRegisteredE.get.getCustNm()  => " + customerRegisteredE.getCustNm() ); 
        System.out.println("customerRegisteredE.get.getCustNo()  => " + customerRegisteredE.getCustNo() ); 
        System.out.println("customerRegisteredE.get.getPhoneNo()  => " + customerRegisteredE.getPhoneNo() ); 
        System.out.println("customerRegisteredE.get.getRealResNo()  => " + customerRegisteredE.getRealResNo() ); 
        System.out.println("customerRegisteredE.get.getAppliedStatus()  => " + customerRegisteredE.getAppliedStatus()); 
        System.out.println("------------------------------------------------------------------------") ;

 
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("customerRegisteredE.statusUpdateP 이벤트 값으로 DB 저장 처리 ") ;
        System.out.println("------------------------------------------------------------------------") ;

        /** Example 1:  new item 
        PreApplicationA preApplicationA = new PreApplicationA();
        repository().save(preApplicationA);

        */

        /** Example 2:  finding and process
        
        repository().findById(customerRegisteredE.get???()).ifPresent(preApplicationA->{
            
            preApplicationA // do something
            repository().save(preApplicationA);


         });
        */

    }

    public static void statusUpdateP(IncomeVerifiedE incomeVerifiedE) {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("PreApplicationA.java statusUpdateP(IncomeVerifiedE incomeVerifiedE)호출 ");
        System.out.println("IncomeVerifiedE 이벤트로 들어온 입력값" ); 
        System.out.println("incomeVerifiedE.getId()  => " + incomeVerifiedE.getId() ); 
        System.out.println("incomeVerifiedE.getCustNo() =>   " +  incomeVerifiedE.getCustNo() );
        System.out.println("incomeVerifiedE.getVerifyResult() => "  + incomeVerifiedE.getVerifyResult() );
        System.out.println("incomeVerifiedE.getIncomeAmount() => " + incomeVerifiedE.getIncomeAmount() );
        System.out.println("incomeVerifiedE.getPhoneNo() => " + incomeVerifiedE.getPhoneNo() );
        System.out.println("incomeVerifiedE.getAppId() => " + incomeVerifiedE.getAppId() ); 
        System.out.println("------------------------------------------------------------------------") ;
        
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("incomeVerifiedE.statusUpdateP 이벤트 값으로 DB 저장 처리 ") ;
        System.out.println("------------------------------------------------------------------------") ;
        
    


        /** Example 1:  new item 
        PreApplicationA preApplicationA = new PreApplicationA();
        repository().save(preApplicationA);

        */

        /** Example 2:  finding and process
        
        repository().findById(incomeVerifiedE.get???()).ifPresent(preApplicationA->{
            
            preApplicationA // do something
            repository().save(preApplicationA);


         });
        */

    }

    public static void statusUpdateP(AccountOpenedE accountOpenedE) {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("PreApplicationA.java statusUpdateP(AccountOpenedE accountOpenedE)호출 ");
        System.out.println("AccountOpenedE 이벤트로 들어온 입력값" ); 
        System.out.println("accountOpenedE.getAccountBalance() => " + accountOpenedE.getAccountBalance() ); 
        System.out.println("accountOpenedE.getAccountStatus() => " + accountOpenedE.getAccountStatus() ); 
        System.out.println("accountOpenedE.getAcctNo() => " + accountOpenedE.getAcctNo() ); 
        System.out.println("accountOpenedE.getCancelDate() => " + accountOpenedE.getCancelDate() ); 
        System.out.println("accountOpenedE.getCustNo() => " + accountOpenedE.getCustNo() ); 
        System.out.println("accountOpenedE.getOpenDate() => " + accountOpenedE.getOpenDate() ); 
        System.out.println("------------------------------------------------------------------------") ;
        
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("accountOpenedE.statusUpdateP 이벤트 값으로 DB 저장 처리 ") ;
        System.out.println("------------------------------------------------------------------------") ;

        /** Example 1:  new item 
        /** Example 1:  new item 
        PreApplicationA preApplicationA = new PreApplicationA();
        repository().save(preApplicationA);

        */

        /** Example 2:  finding and process
        
        repository().findById(accountOpenedE.get???()).ifPresent(preApplicationA->{
            
            preApplicationA // do something
            repository().save(preApplicationA);


         });
        */

    }


}
