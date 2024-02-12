package com.springboot.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.email.model.EmailDetails;
import com.springboot.email.service.MailService;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendMail")
    public Boolean sendMail(@RequestBody EmailDetails emailDetails) {
        return mailService.sendMail(emailDetails);
    }
}