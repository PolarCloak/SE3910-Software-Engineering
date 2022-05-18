package com.example.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    //localhost:8181/spring

    @GetMapping("spring")
    public String spring(Model model){
        model.addAttribute("data1", "Hello David!!!");
        return "spring";
    }

    //http://localhost:8181/hello
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "Hello Mac!!!");
        return "hello";
    }


    @GetMapping("helloapi")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){

        Hello hello = new Hello();
        hello.setName(name);

        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}