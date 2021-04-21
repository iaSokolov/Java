package vtb.geekbrains.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import vtb.geekbrains.kafka.common.dto.MessageDto;

@Service
public class ConsumerService {
    @KafkaListener(topics = "my-topic", groupId = "message_group_id")
    public void consume(MessageDto message){
        System.out.println("Consuming the message: " + message);
    }
}