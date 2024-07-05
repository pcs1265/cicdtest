package com.ssafy.lucky.cicdtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main {
    
    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("testStr", "모델에 있는 어트리뷰트를 표시합니다.");
        return new String("index.html");
    }

}
