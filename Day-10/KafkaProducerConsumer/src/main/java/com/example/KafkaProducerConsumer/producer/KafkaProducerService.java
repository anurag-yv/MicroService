//package com.example.KafkaProducerConsumer.producer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducerService {
//
//    private final KafkaTemplate<String,String> kafkaTemplate;
//    public KafkaProducerService(KafkaTemplate<String,String>kafkaTemplate){
//        this.kafkaTemplate=kafkaTemplate;
//    }
//    public void sendMessage(String message){
//        kafkaTemplate.send("orders",message);
//        System.out.println("Producer sent : "+message);
//    }
//}
package com.example.KafkaProducerConsumer.producer;

import com.example.KafkaProducerConsumer.Entity.Message;
import com.example.KafkaProducerConsumer.Repository.MessageRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final MessageRepository repository;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate,
                                MessageRepository repository) {
        this.kafkaTemplate = kafkaTemplate;
        this.repository = repository;
    }

    public void sendMessage(String message) {

        // Save in H2
        repository.save(new Message(message));

        // Send to Kafka
        kafkaTemplate.send("orderss", message);

        System.out.println("Producer sent: " + message);
    }
}