package com.example.KafkaProducerConsumer.Repository;

import com.example.KafkaProducerConsumer.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}