package com.example.commerce.controller;


import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;
import com.example.commerce.service.AlertService;
import com.example.commerce.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;
    private final AlertService alertService;

    @Autowired
    public MemberController(MemberService memberService, AlertService alertService){
        this.memberService = memberService;
        this.alertService = alertService;
    }

    @GetMapping("/")
    public String home(){
        return "login_page";
    }


    @GetMapping("/login")
    public String login(){
        return "login_page";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @PostMapping("/alerts")
    public String login(Member member, Model model){
        if(memberService.login(member)){
            System.out.println("login success");
            int flag = memberService.determineAlertPage(member);
            if(flag == 0){
                List<Alert> alerts = alertService.findAlerts();
                model.addAttribute("alerts" , alerts);
                return "alerts_page";
            }
            else{
                return "admin_page";
            }
        }
        else{
            return "/error";
        }
    }




}
