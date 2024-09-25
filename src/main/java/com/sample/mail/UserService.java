package com.sample.mail;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class UserService {
    @Autowired
    private JavaMailSender emailSender;

    public String sendMailwithAttachment(UserModel user){
        String pos = user.getPositon(); String comp = user.getCompany_name();
        String Email = user.getEmail();String body= StringContent.getmessage(pos,comp);String Subject = user.getSubject(); String Attachment = user.getAtachment();
      try {
          MimeMessage message = emailSender.createMimeMessage();
          MimeMessageHelper helper = new MimeMessageHelper(message, true);
          helper.setFrom("chanksharu@gmail.com");
          helper.setTo(Email);
          helper.setCc("shashanksh72@gmail.com");
          helper.setText(body);
          helper.setSubject(Subject);
          FileSystemResource resume = new FileSystemResource(new File(Attachment));
          helper.addAttachment(resume.getFilename(), resume);
          emailSender.send(message);
          helper.setText(body);
      }catch (Exception e){
          System.out.print("failed");
      }
      return "Mail is Sent";
    }

}
