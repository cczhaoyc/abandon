package com.suxia.abandon.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap){

        modelMap.addAttribute("name","hello thymeleaf!");
        return "hello" ;
    }
}
