package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class IncomeVerifiedE extends AbstractEvent {

    private Long id;
    private String custNo;
    private String verifyResult;
    private Long incomeAmount;
    private String phoneNo;
    private Long appId;
    // keep

    // koj 20220621   IncomeVerifiedE   이벤트 추가 
    public IncomeVerifiedE(){
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("domain IncomeVerifiedE.java IncomeVerifiedE  이벤트 호출 ");
        System.out.println("custNo => " + custNo + " verifyResult=> " + verifyResult + " incomeAmount=> " + incomeAmount + " phoneNo=> " + phoneNo + " appId=> " + appId );
        System.out.println("------------------------------------------------------------------------") ;
    }
}
