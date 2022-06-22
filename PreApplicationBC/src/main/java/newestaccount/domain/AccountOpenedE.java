package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class AccountOpenedE extends AbstractEvent {

    private Long id;
    private String acctNo;
    private String custNo;
    private String openDate;
    private String cancelDate;
    private String accountStatus;
    private String accountBalance;
    // keep
   
    //koj 20220621 이벤트 추가
    public AccountOpenedE() {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain AccountOpenedE.java AccountOpenedE  이벤트 호출 ");
        System.out.println("domain AccountOpenedE.java AccountOpenedE  이벤트 호출 " );
        
        System.out.println("------------------------------------------------------------------------") ;
        
    } 

}
