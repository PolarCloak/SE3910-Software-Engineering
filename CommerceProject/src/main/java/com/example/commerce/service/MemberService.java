package com.example.commerce.service;

import com.example.commerce.domain.Member;
import com.example.commerce.repository.MemberRepository;
import com.example.commerce.repository.TMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//dependency injection

//@Service
@Transactional
public class MemberService {

    //private final MemberRepository memberRepository = new TMemberRepository();


    private final MemberRepository memberRepository;


    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }


    public boolean login(Member providededInfo){
        //business logic
        return validateLogin(providededInfo);
    }

    private boolean validateLogin(Member providededInfo) {
        Member validMember = validateMemberName(providededInfo);
        if(validMember == null){
            return false;
        }
        return validateMember(providededInfo);
    }

    private Member validateMemberName(Member providedInfo){
        Optional<Member> resultFound = memberRepository.findByName(providedInfo.getName());
        if(resultFound.isEmpty()){
            return null;
        }
        else{
            return resultFound.get();
        }
    }


    private boolean validateMember(Member providedInfo) {
        Member validMember = validateMemberName(providedInfo);
        if(!validMember.getPassword().equals(providedInfo.getPassword())){
            return false;
        }
        else return true;
    }

    public int determineAlertPage(Member member){
        Member validMember = validateMemberName(member);
        return validMember.isAdmin();
    }


    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }





}
