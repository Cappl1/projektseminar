package com.skischool.course.logic;

import com.skischool.course.domain.Course;
import com.skischool.course.domain.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CourseManagementTest {

    @Mock
    CourseRepository courseRepository;

    @InjectMocks
    CourseManagement courseManagement;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllCourses() {
        Course course1 = new Course();
        Course course2 = new Course();
        when(courseRepository.findAll()).thenReturn(Arrays.asList(course1, course2));

        List<Course> courses = courseManagement.getAllCourses();

        assertEquals(2, courses.size());
    }

    @Test
    void addCourse() {
        Course course = new Course();
        when(courseRepository.save(course)).thenReturn(course);

        Course savedCourse = courseManagement.addCourse(course);

        assertEquals(savedCourse, course);
    }
    @Test
    void getAllCoursesEmpty() {
    when(courseRepository.findAll()).thenReturn(new ArrayList<>());
    List<Course> courses = courseManagement.getAllCourses();
    assertEquals(0, courses.size());
}

    @Test
    void addCourseFailure() {
        when(courseRepository.save(any(Course.class))).thenThrow(new RuntimeException("Database error"));
        
        assertThrows(RuntimeException.class, () -> {
            courseManagement.addCourse(new Course());
    });
}
}