package com.exdigest.journalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("/health-check")
        public String healthCheck(){
            return "Ok";

    }
}


