package com.skischool.registration.logic;

import com.skischool.registration.domain.CourseRegistration;
import com.skischool.registration.domain.CourseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistrationManagement {

    private final CourseRegistrationRepository courseRegistrationRepository;

    @Autowired
    public CourseRegistrationManagement(CourseRegistrationRepository courseRegistrationRepository) {
        this.courseRegistrationRepository = courseRegistrationRepository;
    }

    public List<CourseRegistration> getAllRegistrations() {
        return courseRegistrationRepository.findAll();
    }

    public CourseRegistration registerMemberForCourse(CourseRegistration registration) {
        return courseRegistrationRepository.save(registration);
    }

    // Other business methods...
}
