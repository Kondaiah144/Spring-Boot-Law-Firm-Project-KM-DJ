package com.springboot.lawfirmapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/howardnmarialawfirmllc/welcome")
@RestController
public class WelcomeController {

        //http://localhost:8081/howardnmarialawfirmllc/welcome/
        @GetMapping("/")
        public String index() {
            return "Howard & Maria Law Firm Welcomes You!!";
        }
        }
