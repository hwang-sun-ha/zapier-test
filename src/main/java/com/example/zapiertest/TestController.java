package com.example.zapiertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    private String getTime(){
        return LocalDateTime.now().atZone(ZoneId.of("Asia/Seoul")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    @GetMapping("authentication")
    public String authentication(){
        System.out.println(getTime()+" authentication 이 호출되었습니다.");
        return "authentication";
    }
    @GetMapping("issues")
    public String List(){
        System.out.println(">>" + LocalDateTime.now()+" issues 가 호출되었습니다.");
        return "[\n" +
               "  {\n" +
               "    \"id\": "+getTime()+",\n" +
               "    \"key\": \"HRP-"+getTime()+"\",\n" +
               "    \"title\": HRP에서 만들어진 이슈\n" +
               "  }\n" +
               "]";

    }

    @PostMapping("create")
    public String find(@RequestBody String id){
        System.out.println("create  가호출되었습니다."+ "id="+id);
        return id;
    }

}
