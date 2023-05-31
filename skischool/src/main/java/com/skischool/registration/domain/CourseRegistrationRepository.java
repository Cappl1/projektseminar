package com.skischool.registration.domain;

import com.skischool.course.domain.Course;
import com.skischool.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {
    List<CourseRegistration> findByMember(Member member);
    List<CourseRegistration> findByCourse(Course course);
}