package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class PreAppliedE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String appliedStatus;
    private String custNo;

    public PreAppliedE(PreApplicationA aggregate) {
        super(aggregate);
    }

    public PreAppliedE() {
        super();
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("PreAppliedE.java PreAppliedE  이벤트 호출 ");
        System.out.println("------------------------------------------------------------------------") ;

        System.out.println("custNm => [%s]." + custNm);


    }
    // keep

}
