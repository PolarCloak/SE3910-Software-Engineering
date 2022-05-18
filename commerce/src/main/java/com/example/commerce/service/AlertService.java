package com.example.commerce.service;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;
import com.example.commerce.repository.AlertRepository;
import com.example.commerce.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AlertService {

    private final AlertRepository alertRepository;


    @Autowired
    public AlertService(AlertRepository alertRepository){
        this.alertRepository = alertRepository;
    }


    public Long join(Alert alert){
        //business logic
        alertRepository.save(alert);
        return alert.getId();
    }


}
