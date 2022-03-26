package com.example.my_spring_api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class HelloController {

        @GetMapping(path = "/")
        public @ResponseBody 
        String hello(){
            return "hello";
        }
    
}