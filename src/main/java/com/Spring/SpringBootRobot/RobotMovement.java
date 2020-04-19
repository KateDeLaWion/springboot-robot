package com.Spring.SpringBootRobot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotMovement {

    public static void main(String[] args) {

        // Run this main function to work the class RobotMind
        // Inversion of Control example
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:data.xml");

        RobotMind robot1 = context.getBean("robotmind1", RobotMind.class);

        System.out.println("Robot movements : " + robot1);

    }



}
