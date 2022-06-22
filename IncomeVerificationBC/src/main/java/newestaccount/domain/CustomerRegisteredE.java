package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class CustomerRegisteredE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String custNo;
    // keep
    
    public CustomerRegisteredE () {

        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain AccountOpenedE.java AccountOpenedE  이벤트 호출 ");
        System.out.println("domain AccountOpenedE.java AccountOpenedE  이벤트 호출 " );
        System.out.println("------------------------------------------------------------------------") ;
    }    

}
