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
     //권오진  CustomerRegisteredE   고객생성후  사전신청 policy 호출시 입력값이 상태정보 미존재해서 추가함 
    //private String appliedStatus;
    
    // keep

    // koj 20220621 customeRegisteredE  이벤트 생성
    public CustomerRegisteredE(){
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain CustomerRegisteredE.java CustomerRegisteredE  이벤트 호출 ");
        System.out.println("realResNo => " + realResNo + " custNm=> " + custNm + " phoneNo=> " + phoneNo + " custNo=> " + custNo  );
        System.out.println("------------------------------------------------------------------------") ;
    }

}
