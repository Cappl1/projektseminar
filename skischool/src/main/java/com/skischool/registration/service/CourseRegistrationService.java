package com.skischool.registration.service;

import com.skischool.registration.domain.CourseRegistration;
import com.skischool.registration.logic.CourseRegistrationManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class CourseRegistrationService {

    private final CourseRegistrationManagement courseRegistrationManagement;

    @Autowired
    public CourseRegistrationService(CourseRegistrationManagement courseRegistrationManagement) {
        this.courseRegistrationManagement = courseRegistrationManagement;
    }

    @GetMapping
    public List<CourseRegistration> getAllRegistrations() {
        return courseRegistrationManagement.getAllRegistrations();
    }

    @PostMapping
    public CourseRegistration registerMemberForCourse(@RequestBody CourseRegistration registration) {
        return courseRegistrationManagement.registerMemberForCourse(registration);
    }

    // other REST endpoints...
}