package com.skischool.member.logic;

import com.skischool.member.domain.Member;
import com.skischool.member.domain.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberManagement {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberManagement(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    // Other business methods...
}