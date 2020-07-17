package com.example.oAuth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello in the World of Kriti";
    }

    @GetMapping("/restricted")
    public String restricted()
    {
        return "Welcome here , you have now logged inside";
    }

    @GetMapping("/notrestricted")
    public String notRestricted()
    {
        return "Welcome here , you have now logged inside not restricted area";
    }
}
