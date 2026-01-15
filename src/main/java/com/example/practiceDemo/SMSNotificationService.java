package com.example.practiceDemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
@ConditionalOnProperty(name="notification.type", havingValue="sms")
public class SMSNotificationService implements NotificationService{
    @Override
    public void notifys() {
        System.out.println("SMS notification service");
    }
}
