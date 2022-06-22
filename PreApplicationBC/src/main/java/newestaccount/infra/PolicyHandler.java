package newestaccount.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import newestaccount.config.kafka.KafkaProcessor;
import newestaccount.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PreApplicationARepository preApplicationARepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("----infra PolicyHandler.java whatever(@Payload String eventString)   호출 ");
        System.out.println("----eventString =>" + eventString);
        System.out.println("------------------------------------------------------------------------") ;
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCustomerRegisteredE_StatusUpdateP(
        @Payload CustomerRegisteredE customerRegisteredE
    ) {
        
        if (!customerRegisteredE.validate()) return;
        CustomerRegisteredE event = customerRegisteredE;

        //koj 20220621 print 추가 
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("----infra PolicyHandler.java wheneverCustomerRegisteredE_StatusUpdateP (@Payload CustomerRegisteredE customerRegisteredE) 호출 ");
        System.out.println("------------------------------------------------------------------------") ;

        System.out.println(
            "\n\n##### listener StatusUpdateP : " +
            customerRegisteredE.toJson() +
            "\n\n"
        );

        // Sample Logic //
        
        PreApplicationA.statusUpdateP(event);

        
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverIncomeVerifiedE_StatusUpdateP(
        @Payload IncomeVerifiedE incomeVerifiedE
    ) {
        
        if (!incomeVerifiedE.validate()) return;
        IncomeVerifiedE event = incomeVerifiedE;

         //koj 20220621 print 추가 
         System.out.println("------------------------------------------------------------------------") ;
         System.out.println("----infra PolicyHandler.java wheneverIncomeVerifiedE_StatusUpdateP (@Payload IncomeVerifiedE incomeVerifiedE) 호출 ");
         System.out.println("------------------------------------------------------------------------") ;

         
        System.out.println(
            "\n\n##### listener StatusUpdateP : " +
            incomeVerifiedE.toJson() +
            "\n\n"
        );
        

        // Sample Logic //
       
        PreApplicationA.statusUpdateP(event);

       
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverAccountOpenedE_StatusUpdateP(
        @Payload AccountOpenedE accountOpenedE
    ) {
       

        if (!accountOpenedE.validate()) return;
        AccountOpenedE event = accountOpenedE;

        //koj 20220621 print 추가 
        System.out.println("------------------------------------------------------------------------") ;
        System.out.println("----infra PolicyHandler.java wheneverAccountOpenedE_StatusUpdateP ( @Payload AccountOpenedE accountOpenedE) 호출 ");
        System.out.println("------------------------------------------------------------------------") ;

        System.out.println(
            "\n\n##### listener StatusUpdateP : " +
            accountOpenedE.toJson() +
            "\n\n"
        );

        // Sample Logic //

        
        PreApplicationA.statusUpdateP(event);

       
    }
    // keep

}
