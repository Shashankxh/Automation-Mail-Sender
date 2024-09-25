package com.sample.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.sample.mail.UserModel;

@RestController
@RequestMapping("/v1/email")
public class controller {
    @Autowired
    UserService userService;
    @PostMapping
public String sendmail(@RequestBody UserModel user){
        String text = userService.sendMailwithAttachment(user);
return text;
}
}
