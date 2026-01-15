package com.example.practiceDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary only one primary bean

//@Qualifier("email")
@ConditionalOnProperty(name="notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService{
    public void notifys(){
        System.out.println("Email notification service");


    }
}
