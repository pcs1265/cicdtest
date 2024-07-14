package com.ssafy.lucky.cicdtest;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main {
    
    @GetMapping("/")
    public String getMethodName(Model model) {
        Date now = new Date();
        model.addAttribute("versionStr", "0.0.3-SUPER");
        model.addAttribute("dateStr", now.toString());
        return new String("index.html");
    }

}
