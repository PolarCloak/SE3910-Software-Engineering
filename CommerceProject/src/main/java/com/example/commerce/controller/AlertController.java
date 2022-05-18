package com.example.commerce.controller;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;
import com.example.commerce.service.AlertService;
import com.example.commerce.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AlertController {

    private final AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService){
        this.alertService = alertService;
    }


    @GetMapping("/alerts_page")
    public String list(Model model){
        List<Alert> alerts = alertService.findAlerts();
        model.addAttribute("alerts" , alerts);

        return "/alerts_page";
    }

    @PostMapping("/alertMsg")
    public String alert(@RequestBody AlertForm form){

        Alert alert = new Alert();
        alert.setTimestamp(form.getTimestamp());
        alert.setHostname(form.getHostname());
        alert.setApplication_id(form.getApplication_id());
        alert.setFile(form.getFile());
        alert.setChange_agent(form.getChange_agent());
        alert.setChange_process(form.getChange_process());

        alertService.join(alert);

        return "alerts_page";
    }

    @GetMapping("/popup")
    public String popup(){
        return "pop_ups_page";
    }


//    @GetMapping("/alerts")
//    public String getAlerts(Model model){
//
//        List<Alert> alerts = alertService.findAlerts();
//        model.addAttribute("alerts" , alerts);
//
//        return "alerts_page";
//    }


}