package com.pey.main;

import com.pey.service.GreetingMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl",
                GreetingMessageService.class);
        System.out.println(greetingMessageService.greetUser());
    }
}
