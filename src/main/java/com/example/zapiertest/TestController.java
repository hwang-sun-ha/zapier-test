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
    public String List(){
        System.out.println("list  가호출되었습니다.");
        return "[\n" +
               "  {\n" +
               "    \"id\": 7,\n" +
               "    \"created\": \"Mon, 25 Jun 2012 16:41:54 -0400\",\n" +
               "    \"list_id\": 1,\n" +
               "    \"description\": \"integrate our api with zapier\",\n" +
               "    \"complete\": false\n" +
               "  },\n" +
               "  {\n" +
               "    \"id\": 6,\n" +
               "    \"created\": \"Mon, 25 Jun 2012 16:41:45 -0400\",\n" +
               "    \"list_id\": 1,\n" +
               "    \"description\": \"get published in zapier library\",\n" +
               "    \"complete\": false\n" +
               "  }\n" +
               "]";

    }
    static class Data {
        String name;
        String key;
    }
}
