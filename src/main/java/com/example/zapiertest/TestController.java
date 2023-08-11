package com.example.zapiertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("welcome")
    public String welcome(){
        System.out.println("welcome 이 호출되었습니다.");
        return "welcome";
    }
}
