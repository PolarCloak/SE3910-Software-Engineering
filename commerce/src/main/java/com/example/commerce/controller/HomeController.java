package com.example.commerce.controller;


import com.example.commerce.domain.Alert;
import com.example.commerce.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// S.O.L.I.D design principles
// SRP, OCP, LSP, ISP, DIP
// JPA,
@Controller
public class HomeController {

    private final AlertService alertService;

    @Autowired
    public HomeController(AlertService alertService){
        this.alertService = alertService;
    }


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login_page";
    }

    @GetMapping("/popups")
    public String popups(){
        return "pop_ups_page";
    }


    @PostMapping("/alert")
    public String login(User user){

        System.out.println("--------------------");
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println("--------------------");

        return "alerts_page";
    }


    @PostMapping("/alertMsg")
    public String alert(@RequestBody AlertForm form){

        Alert alert = new Alert();
        alert.setTimestamp(form.getTimestamp());
        alert.setHostname(form.getHostname());
        alert.setAppid(form.getAppid());
        alert.setFile(form.getFile());
        alert.setChangeagenet(form.getChangeagent());
        alert.setChangeprocess(form.getChangeprocess());

        alertService.join(alert);

        return "alerts_page";
    }

}
