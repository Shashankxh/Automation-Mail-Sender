package com.sample.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailApplication {
//@Autowired
//UserService userservice;
	public static void main(String[] args) {
		SpringApplication.run(MailApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
////	 public void Trigger(){
//		userservice.sendMailwithAttachment("shashanksh72@gmail.com",
//				StringContent.getmessage("Java Developer","Charu"),"This is Testing",
//				"C:Users/HP/Downloads/Resume_Shashank.pdf" );
//	}

}
