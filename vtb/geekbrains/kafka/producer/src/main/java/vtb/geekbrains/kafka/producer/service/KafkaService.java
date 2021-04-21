package vtb.geekbrains.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import vtb.geekbrains.kafka.common.dto.MessageDto;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, MessageDto> kafkaTemplate;

    public void produce(MessageDto message) {
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send("my-topic", message);
    }
}
