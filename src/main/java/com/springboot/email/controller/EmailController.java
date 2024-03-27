package com.springboot.email.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.email.model.EmailDetails;
import com.springboot.email.service.MailService;

@RestController
@RequestMapping("/api")
public class EmailController {

    private MailService mailService;

    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/sendMail")
    public Boolean sendMail(@RequestBody EmailDetails emailDetails) {
        return mailService.sendMail(emailDetails);
    }

    // curl -X POST -H 'Content-Type: application/json' -d '{"to": "<RECIPIENT_MAIL>", "subject": "test subject", "body": "test body"}' http://localhost:8081/api/sendMail -w "\n"
}