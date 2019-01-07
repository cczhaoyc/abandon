package com.suxia.abandon.thymeleaf;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(){
        return "err";
    }

}
