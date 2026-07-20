package com.company.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingServiceTest {

    @Test
    void testGreeting(){

        GreetingService service = new GreetingService();

        service.printGreeting();

        assertTrue(true);

    }

}