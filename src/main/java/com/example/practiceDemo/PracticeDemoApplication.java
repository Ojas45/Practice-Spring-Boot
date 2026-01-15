package com.example.practiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeDemoApplication implements CommandLineRunner {
//	@Autowired
	final NotificationService notificationService ;

	public static void main(String[] args) {
		SpringApplication.run(PracticeDemoApplication.class, args);
	}


	// Using Qualifier
//	public PracticeDemoApplication(@Qualifier("email")NotificationService notificationService) {
//		this.notificationService = notificationService;
//	}


	public PracticeDemoApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void run(String... args) throws Exception {
		//Tight coupling
//		NotificationService notificationService= new SMSNotificationService();
//		notificationService.notifys();


		//Loose Coupling




		notificationService.notifys();



	}
}
