package com.ll.exam.ideaBANK_Aug13.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/* Controller 클래스에 @Controller 애노테이션을 작성합니다
해당 애노테이션이 적용된 클래스는 Controller임을 나타내고,
bean으로 등록되어 해당 클래스가 Controller로 사용됨을 Spring Framework에 알립니다.
*/
public class homeController {
    @GetMapping("/")
    /*
    localhost:8080/ 요청이 들어오면 아래의 메소드를 실행하도록 하는 역할
     */
    public String showHome() {return "home";}
}
