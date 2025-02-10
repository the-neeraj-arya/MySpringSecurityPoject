package com.security.springSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    /* @RestController likhne se automatically sare methods @ResponseBody ke sath kaam karenge. */
    @GetMapping("/home")
    public @ResponseBody String home() {
        return "Welcome to the home.";
    }

    @GetMapping("/home1")
    public String home1() {
        return "Welcome to the home1.";
    }

    /* ResponseEntity.ok("text") ka use karne se response status code 200 OK ke sath milega. */
    @GetMapping("/user")
    public ResponseEntity<String> user() {
        return ResponseEntity.ok("I am the using user.");
    }

    /** 1. Note: Agar @Controller use karega bina @ResponseBody ke to Spring tujhse
           home.html ya home.jsp view file dhoondega, jo ki tu nahi chahta.
        2. Kyunki @RestController internally @Controller + @ResponseBody ka combination hai,
           isliye @ResponseBody automatically apply ho jata hai.
        3. "Welcome to the Home Page!" plain text ya JSON format me return hoga.  ***/

}
