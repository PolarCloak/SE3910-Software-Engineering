package com.example.commerce.repository;

import com.example.commerce.domain.Employee;
import com.example.commerce.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class EmployeeRepository {

    private final EntityManager em;

    public EmployeeRepository(EntityManager em){
        this.em = em;
    }

    public Member save(Member member) {
        em.persist(member);
        return member;
    }


}