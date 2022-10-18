package com.puhu17.view.controller;

import com.puhu17.view.domain.SampleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PageController {
    @GetMapping("/")
    public String main(Model model){
        Map<String,Object> map = new HashMap<>();

        map.put("Language","java");
        map.put("Framework","Spring Boot");
        map.put("Database","Mariadb");
        map.put("IDE","IntelliJ");
        map.put("Build_Tool","Gradle");
        map.put("WAS","Tomcat");

        //View에 데이터 전달

        model.addAttribute("map",map);

        List<String> list = new ArrayList<>();
        list.add("Back End Dev");
        list.add("Front End Dev");
        list.add("Operator");
        list.add("DBA");
        list.add("Data Analysis");
        list.add("Visualization Artist");
        list.add("Big Data");
        list.add("AI");
        list.add("Cloud - DevOps, MLOps, CI/CD");
        model.addAttribute("list",list);
        return "main";
    }
    //요청처리 메서드가 아무것도 리턴하지 않는 경우 view 이름은 요쳥 url이 됨
    @GetMapping("/ex1")
    public void ex1(){}

    @GetMapping({"/ex2","/exformat"})
    public void ex2(Model model){
        List<SampleVO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj( i->{
            SampleVO vo = SampleVO.builder().idx(i)
                    .name("김씨"+i+"번").email("aa"+i+"@gmail.com").id("bbb"+i)
                    .pw("dtxcvase"+i).regTime(LocalDateTime.now()).build();
            return vo;
        }).collect(Collectors.toList());
        model.addAttribute("lists",list);
    }

}
