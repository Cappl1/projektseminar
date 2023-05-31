package com.skischool.member.service;

import com.skischool.member.domain.Member;
import com.skischool.member.logic.MemberManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberService {

    private final MemberManagement memberManagement;

    @Autowired
    public MemberService(MemberManagement memberManagement) {
        this.memberManagement = memberManagement;
    }

    @GetMapping("/")
    public List<Member> getAllMembers() {
        return memberManagement.getAllMembers();
    }

    @PostMapping("/")
    public Member createMember(@RequestBody Member member) {
        return memberManagement.createMember(member);
    }

    // other REST endpoints...
}
