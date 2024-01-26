package com.sk.i2i.isubu.mth501.abmf;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.time.Duration;
import java.util.List;

public class ABMF {

    public static void main(String[] args) {
    //Consumer<Long, UsageMessage> consumer = Subscriber.createMockMessages();
    List<UsageMessage> mockMessages = Subscriber.createMockMessages();

   
   for (UsageMessage mockMessage : mockMessages) {
            String msisdn = mockMessage.getMsisdn();
            Long usedAmount = mockMessage.getUsedAmount();
            String usedService = mockMessage.getUsedService();
            int price = mockMessage.getPrice();
            int subscriberID = mockMessage.getSubscriberID();
            
            String response = "";
            if (usedService.equals("data")) {
                response = Operations.updateData(subscriberID, msisdn, usedAmount);
            } else if (usedService.equals("sms")) {
                response = Operations.updateSms(subscriberID, msisdn, usedAmount);
            } else if (usedService.equals("voice")) {
                response = Operations.updateVoice(subscriberID, msisdn, usedAmount);
            } 
            System.out.println("RESPONSE : " + response);
            
            System.out.println(subscriberID);
            System.out.println(msisdn);
            System.out.println(usedAmount);
            System.out.println(usedService);
            System.out.println(price);
            
        }

        //consumer.commitAsync();
    }
}


  
    
    
  
    
    

