package com.springboot.email.service;

import org.springframework.core.io.InputStreamSource;
import com.springboot.email.model.EmailDetails;

public interface MailService {

    Boolean sendMail(EmailDetails emailDetails);
    Boolean sendMailWithAttachment(String to, String subject, String text, InputStreamSource attachementFile, String attachementFileName);
}
