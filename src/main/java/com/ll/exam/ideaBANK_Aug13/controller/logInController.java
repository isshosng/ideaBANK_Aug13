package com.ll.exam.ideaBANK_Aug13.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logInController {

    @GetMapping("/login")
    public String showHome() { return "login";}
}
