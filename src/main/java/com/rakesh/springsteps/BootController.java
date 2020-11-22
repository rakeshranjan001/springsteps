package com.rakesh.springsteps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class BootController {
    @GetMapping("/")
    public String home(){
        return "You've reached SpringSteps";
    }
}
