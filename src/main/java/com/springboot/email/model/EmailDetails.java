package com.springboot.email.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmailDetails {

    private String to;
    private String body;
    private String subject;
}