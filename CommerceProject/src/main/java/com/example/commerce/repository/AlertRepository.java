package com.example.commerce.repository;

import com.example.commerce.domain.Alert;
import com.example.commerce.domain.Member;

import java.util.List;
import java.util.Optional;

public interface AlertRepository {

    Alert save(Alert alert);
    Optional<Alert> findById(Long id);
    Optional<Alert> findByHostname(String hostname);
    Optional<Alert> findByApplicationId(String applicationId);
    Optional<Alert> findByChangeAgent(String changeAgent);
    List<Alert> findAll();
}
