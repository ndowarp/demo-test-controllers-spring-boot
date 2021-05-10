package com.example.demotestcontrollersspringboot.controllers;

import com.example.demotestcontrollersspringboot.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {

    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping
    public String welcome(@RequestParam(defaultValue = "Stranger") String name){
        return welcomeService.getWelcomeMessage(name);
    }

}
