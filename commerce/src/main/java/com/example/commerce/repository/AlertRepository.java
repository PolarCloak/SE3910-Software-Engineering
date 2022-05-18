package com.example.commerce.repository;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;

import javax.persistence.EntityManager;

public class AlertRepository {

    private final EntityManager em;

    public AlertRepository(EntityManager em){
        this.em = em;
    }

    public Alert save(Alert alert) {
        em.persist(alert);
        return alert;
    }

}
