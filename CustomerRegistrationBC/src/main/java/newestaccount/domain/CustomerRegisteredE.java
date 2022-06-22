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


    public CustomerRegisteredE(CustomerA aggregate) {
        super(aggregate);

        System.out.println("-----고객생성-------------------------------------------------------------------") ;
        System.out.println("----CustomerRegisteredE.java  CustomerRegisteredE(CustomerA aggregate)호출 ");
        System.out.println("----고객생성 이벤트  호출시 발생 거래 ");
        System.out.println("------------------------------------------------------------------------") ;

    }

    public CustomerRegisteredE() {
        super();
        System.out.println("-----고객생성-------------------------------------------------------------------") ;
        System.out.println("----CustomerRegisteredE.java  CustomerRegisteredE()호출 ");
        System.out.println("----고객생성 이벤트  호출시 발생 거래 ");
        System.out.println("------------------------------------------------------------------------") ;

    }
    // keep

}
