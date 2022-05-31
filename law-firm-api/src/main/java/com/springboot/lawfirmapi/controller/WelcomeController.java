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
            return "Howard & Maria Law Firm Welcomes You!!" + "\n" + "\n" + "The legal industry is indispensable across many personal and professional areas.\n " +
                    "Law firms, much like accounting services, can provide many services, including Categories: \n" +
                    "\n" +
                    "Criminal law\n" +
                    "Business law\n" +
                    "Family law\n" +
                    "Trusts and estates\n" +
                    "Constitutional law\n" +
                    "Intellectual property law\n" +
                    "Personal injury law";
        }
        }
