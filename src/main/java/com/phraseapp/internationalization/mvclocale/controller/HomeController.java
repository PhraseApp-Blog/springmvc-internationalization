package com.phraseapp.internationalization.mvclocale.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    Logger log = Logger.getLogger(HomeController.class.getName());
    
    @GetMapping(value = "/welcome")
    public String welcomePage() {
        log.info("INTO welcomePage");
        return "welcome";
    }

    @GetMapping(value = "/index")
    public String index() {
        log.info("INTO index");
        return "index";
    }

}
