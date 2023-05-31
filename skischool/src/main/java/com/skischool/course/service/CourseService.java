package com.skischool.course.service;

import com.skischool.course.domain.Course;
import com.skischool.course.logic.CourseManagement;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseService {

    private final CourseManagement courseManagement;

    public CourseService(CourseManagement courseManagement) {
        this.courseManagement = courseManagement;
    }

    @GetMapping("/")
    public List<Course> getAllCourses() {
        return courseManagement.getAllCourses();
    }

    @PostMapping("/")
    public Course addCourse(@RequestBody Course course) {
        return courseManagement.addCourse(course);
    }

    // other REST endpoints...
}