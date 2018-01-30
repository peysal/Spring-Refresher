package com.pey.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

    public String greetUser() {
        return "Hello user spring";
    }
}
