package com.skischool.registration.domain;


import com.skischool.course.domain.Course;
import com.skischool.member.domain.Member;

import jakarta.persistence.*;

@Entity
public class CourseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Course course;

    // Getters
    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public Course getCourse() {
        return course;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}