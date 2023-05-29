package com.epac.Press.config;
import com.epac.Press.Service.PressService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsummer {
    @Autowired
    PressService pressService;
    @KafkaListener(topics = "PRESS", groupId = "PRESS")
    public void consume(String message) throws JsonProcessingException {
        System.out.println(message);
        pressService.receiveJob(message);
         }


}



