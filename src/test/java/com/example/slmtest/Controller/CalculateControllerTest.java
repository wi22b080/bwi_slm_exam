package com.example.slmtest.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CalculateControllerTest {

        @Test
        void calculateFactorial(){
            CalculateController controller = new CalculateController();
            int result = controller.calculate(5);
            assertEquals(result, 120);
        }
    }

