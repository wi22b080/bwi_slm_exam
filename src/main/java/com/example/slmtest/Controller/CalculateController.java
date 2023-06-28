package com.example.slmtest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    int total = 0;
    @RequestMapping("/api/factorial")
    public int calculate(@RequestParam int number){
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = i * factorial;
        }
        total += factorial;
        return factorial;

    }
    @RequestMapping("/api/factorial/total")
    public int add(){
        return total;

    }
}