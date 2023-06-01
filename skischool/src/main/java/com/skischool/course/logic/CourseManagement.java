package com.skischool.course.logic;


import org.springframework.stereotype.Service;
import com.skischool.course.domain.Course;
import com.skischool.course.domain.CourseRepository;


import java.util.List;

@Service
public class CourseManagement {

    private final CourseRepository courseRepository;

    public CourseManagement(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }
    
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
    }



    // other methods to handle business logic...
}