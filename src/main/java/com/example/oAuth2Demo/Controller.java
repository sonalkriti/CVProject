package com.example.oAuth2Demo;

import com.example.oAuth2Demo.repository.UserRepository;
import com.example.oAuth2Demo.repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UserRepositoryImpl userRepository;


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

    @GetMapping("/database")
    public void database()
    {
        System.out.println(userRepository.findUserById(1L));

    }

}
