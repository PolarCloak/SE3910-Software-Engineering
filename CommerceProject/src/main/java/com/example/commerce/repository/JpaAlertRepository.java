package com.example.commerce.repository;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaAlertRepository implements AlertRepository {

    private final EntityManager em;

    public JpaAlertRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Alert save(Alert alert) {
        em.persist(alert);
        return alert;
    }

    @Override
    public Optional<Alert> findById(Long id) {
        Alert alert = em.find(Alert.class, id);
        return Optional.ofNullable(alert);
    }

    @Override
    public Optional<Alert> findByHostname(String hostname) {
        return Optional.empty();
    }

    @Override
    public Optional<Alert> findByApplicationId(String applicationId) {
        return Optional.empty();
    }

    @Override
    public Optional<Alert> findByChangeAgent(String changeAgent) {
        return Optional.empty();
    }


    @Override
    public List<Alert> findAll() {
        List<Alert> alerts = em.createQuery("select a from Alert a", Alert.class)
                .getResultList();



        return alerts;
    }
}


