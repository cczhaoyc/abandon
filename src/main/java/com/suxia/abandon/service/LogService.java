package com.suxia.abandon.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    public void log(){
        System.out.println("LogService: TestAop");
    }

}
