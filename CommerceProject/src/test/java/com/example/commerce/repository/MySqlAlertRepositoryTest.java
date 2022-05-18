package com.example.commerce.repository;

import com.example.commerce.domain.Alert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MySqlAlertRepositoryTest {

    @Autowired
    EntityManager em;
    MySqlAlertRepository repository = new MySqlAlertRepository(em);

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByHostname() {
    }

    @Test
    void findByApplicationId() {
    }

    @Test
    void findByChangeAgent() {
    }

    @Test
    void findAll() {

        List<Alert> alerts = repository.findAll();
        assertThat(alerts.size()).isEqualTo(2);

    }
}