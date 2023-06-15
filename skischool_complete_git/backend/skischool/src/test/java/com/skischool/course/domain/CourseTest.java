

package com.skischool.course.domain;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    
    @Test
    void testCourseGettersSetters() {
        Course course = new Course();
        LocalDateTime now = LocalDateTime.now();

        course.setId(1L);
        course.setName("Test Course");
        course.setDescription("This is a test course.");
        course.setDuration(60);
        course.setTime(now);

        assertEquals(1L, course.getId());
        assertEquals("Test Course", course.getName());
        assertEquals("This is a test course.", course.getDescription());
        assertEquals(60, course.getDuration());
        assertEquals(now, course.getTime());
    }
    @Test
    void testCourseWithNullValues() {
        Course course = new Course();
        course.setName(null);
        course.setDescription(null);
        course.setTime(null);
        
        assertNull(course.getName());
        assertNull(course.getDescription());
        assertNull(course.getTime());
    }
}
