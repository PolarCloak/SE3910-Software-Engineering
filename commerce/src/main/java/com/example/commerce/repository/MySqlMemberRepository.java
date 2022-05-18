package com.example.commerce.repository;

import com.example.commerce.domain.Member;

import java.util.List;
import java.util.Optional;

public class MySqlMemberRepository implements MemberRepository{
    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public void clearstore() {

    }
}
