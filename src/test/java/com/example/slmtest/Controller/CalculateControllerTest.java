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

        @Test
        void addFactorial(){
            CalculateController controller = new CalculateController();
            int result = controller.add();
            assertEquals(result, 0);
        }

        @Test
        void addFactorialFlowTest(){
            CalculateController controller = new CalculateController();
            //print total
            int result = controller.add();
            assertEquals(result, 0);
            //calculate
            result = controller.calculate(5);
            assertEquals(result, 120);
            //calculate
            result = controller.calculate(4);
            assertEquals(result, 24);
            //print total
            result = controller.add();
            assertEquals(result, 144);
        }
    }
