package com.example.project;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(CalculatorConfig.class)
class CalculatorSpringTests {

    @RepeatedTest(100)
    void addsTwoNumbersUsingSpring(@Autowired Calculator calculator) {
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }
}