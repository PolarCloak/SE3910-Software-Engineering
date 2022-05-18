package com.example.commerce.repository;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class MySqlAlertRepository implements AlertRepository{

    private final EntityManager em;


    public MySqlAlertRepository(EntityManager em){
        this.em = em;
    }
    @Override
    public Alert save(Alert alert) {
        em.persist(alert);
        return alert;
    }

    @Override
    public Optional<Alert> findById(Long id) {
        return null;
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

         System.out.println("AlertRepository");
         List<Alert> alerts = em.createQuery("select m from Alert m", Alert.class)
                .getResultList();

        for(int i = 0; i < alerts.size(); i++){
            System.out.println(alerts.get(i).getApplication_id());
            System.out.println(alerts.get(i).getChange_agent());
            System.out.println(alerts.get(i).getFile());
            System.out.println(alerts.get(i).getHostname());

        }

        return alerts;
    }
}
