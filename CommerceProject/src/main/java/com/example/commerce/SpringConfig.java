package com.example.commerce;


import com.example.commerce.domain.Mail;
import com.example.commerce.repository.*;
import com.example.commerce.service.AlertService;
import com.example.commerce.service.MailService;
import com.example.commerce.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.persistence.EntityManager;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    private DataSource dataSource;

    private EntityManager en;

    //@Autowired
    //public SpringConfig(DataSource dataSource){
    //    this.dataSource = dataSource;
    //}

    @Autowired
    public SpringConfig(EntityManager en){
        this.en = en;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MySqlMemberRepository(en);
    }

    @Bean
    public AlertService alertService(){
        return new AlertService(alertRepository());
    }

    @Bean
    public AlertRepository alertRepository(){
        return new MySqlAlertRepository(en);
    }

}
