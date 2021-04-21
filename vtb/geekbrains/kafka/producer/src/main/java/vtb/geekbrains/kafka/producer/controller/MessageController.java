package vtb.geekbrains.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vtb.geekbrains.kafka.common.dto.MessageDto;
import vtb.geekbrains.kafka.producer.service.KafkaService;
import vtb.geekbrains.kafka.common.dto.MessageDto;

@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/generate")
    public String generate(@RequestParam String message, @RequestParam Integer age) {
        kafkaService.produce(new MessageDto(message, age));
        return "OK";
    }
}
