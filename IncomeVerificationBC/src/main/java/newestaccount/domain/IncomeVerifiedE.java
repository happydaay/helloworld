package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;
import java.util.Random;

@Data
public class IncomeVerifiedE extends AbstractEvent {

    private Long id;
    private String custNo;
    private String verifyResult;
    private Long incomeAmount;
    private String phoneNo;
    private Long appId;

    private Long iValue;
    public IncomeVerifiedE(IncomeVerificationResultA aggregate) {
    
        super(aggregate);

        Random rand = new Random();
        int iValue = 10000000 * rand.nextInt(10);
        
        incomeAmount = (long) iValue ;

        if (iValue > 50000000)
        {
            verifyResult = "Y" ;
        }
        else
        {
            verifyResult = "N" ;
        }
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("IncomeVerifiedE.java IncomeVerifiedE(IncomeVerificationResultA)호출1 ");
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("----lsw----" +id +"-----------" ) ;
        System.out.println("----lsw----" +custNo +"-----------" ) ;
        System.out.println("----lsw----" +verifyResult +"-----------" ) ;
        System.out.println("----lsw----" +incomeAmount +"-----------" ) ;
        System.out.println("----lsw----" +iValue +"-----------" ) ;
        System.out.println("IncomeVerifiedE.java IncomeVerifiedE(IncomeVerificationResultA)호출1 ");
        System.out.println("------------------------------------------------------------------------") ;
        
    }

    public IncomeVerifiedE() {
        super();
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("IncomeVerifiedE.java IncomeVerifiedE(IncomeVerifiedE)호출2 ");
        System.out.println("------------------------------------------------------------------------") ;
    }
    // keep

}
