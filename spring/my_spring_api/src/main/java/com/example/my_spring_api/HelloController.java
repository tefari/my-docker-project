package com.example.my_spring_api;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/")
public class HelloController {
    @ModelAttribute
    private void setResponseHeader(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/")
    public @ResponseBody
    String hello() {
        return "hello";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/get")
    public @ResponseBody
    String get() {
        String response ="{\"status\":\"example\"}";
        return response;
    }

}