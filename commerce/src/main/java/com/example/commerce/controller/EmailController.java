package com.example.commerce.controller;

import com.example.commerce.domain.Mail;
import com.example.commerce.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    MailService mailService;

    @GetMapping(value="/email")
    public String email(Model model) {
        return "Email/email";
    }

    @PostMapping(value = "/emailsend")
    public String sendMail(String title, String msg) {

        Mail mail = new Mail();
        mail.setMailFrom("tkang@ucmo.edu");
        mail.setMailTo("tkang@ucmo.edu");
        mail.setMailSubject(title);
        mail.setMailContent(msg);

        mailService.sendEmail(mail);

        return "redirect:/";

    }
}
