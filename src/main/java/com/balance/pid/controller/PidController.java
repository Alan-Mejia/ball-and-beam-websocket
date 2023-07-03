package com.balance.pid.controller;

import com.balance.pid.messages.ChangeSystemParameters;
import com.balance.pid.messages.DeviceInfo;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
public class PidController {

    private SimpMessagingTemplate simpMessagingTemplate;

    public PidController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @MessageMapping("/device-system-info/{to}")
    public void deviceInfo(@DestinationVariable String to, DeviceInfo deviceInfo){
        System.out.println("Device info: " + deviceInfo.toString());
        simpMessagingTemplate.convertAndSend("/connection/systeminfo/" + to, deviceInfo);
    }

    @MessageMapping("/change-system-parameters/{to}")
    public void changeSystemParameters(@DestinationVariable String to, ChangeSystemParameters changeSystemParameters){
        System.out.println(changeSystemParameters.toString());
        simpMessagingTemplate.convertAndSend("/connection/changeParameters/" + to, changeSystemParameters);
    }

}
