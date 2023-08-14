package com.example.zapiertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @GetMapping("welcome")
    public String welcome(){
        System.out.println("welcome 이 호출되었습니다.");
        return "welcome";
    }
    @GetMapping("list")
    public  List<Integer>  List(){
        System.out.println("list  가호출되었습니다.");
        return List.of(1, 2, 3, 4, 5);

    }
    static class Data {
        String name;
        String key;
    }
}
