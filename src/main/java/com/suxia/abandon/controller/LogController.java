package com.suxia.abandon.controller;

import com.suxia.abandon.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/log")
    public void log(){
        logService.log();
    }
}
