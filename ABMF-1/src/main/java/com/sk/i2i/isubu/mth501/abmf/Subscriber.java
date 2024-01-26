package com.sk.i2i.isubu.mth501.abmf;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Subscriber {

    public static List<UsageMessage> createMockMessages() {
        List<UsageMessage> mockMessages = new ArrayList<>();

        // Mock verileri oluştur
        UsageMessage mockMessage1 = new UsageMessage(100, "5551234567", 1, "data", 0);
        UsageMessage mockMessage2 = new UsageMessage(50, "5559876543", 2, "sms", 0);
        UsageMessage mockMessage3 = new UsageMessage(30, "5551112233", 3, "voice", 0);
        UsageMessage mockMessage4 = new UsageMessage(0, "5554445555", 4, "wallet", 0);

        // Mock verilerini listeye ekle
        mockMessages.add(mockMessage1);
        mockMessages.add(mockMessage2);
        mockMessages.add(mockMessage3);
        mockMessages.add(mockMessage4);

        return mockMessages;
    }
    
    
    
    
   
    
    
   
}
