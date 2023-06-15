package com.skischool.course.service;

import com.skischool.course.domain.Course;
import com.skischool.course.logic.CourseManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
class CourseServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseManagement courseManagement;

    @BeforeEach
    void setUp() {
        Course course = new Course();
        when(courseManagement.getAllCourses()).thenReturn(Collections.singletonList(course));
        when(courseManagement.addCourse(any(Course.class))).thenReturn(course);
    }

    @Test
    void getAllCourses() throws Exception {
        mockMvc.perform(get("/courses/"))
                .andExpect(status().isOk());
    }

    @Test
    void addCourse() throws Exception {
        mockMvc.perform(post("/courses/").contentType(MediaType.APPLICATION_JSON).content("{\"name\":\"Course1\"}"))
                .andExpect(status().isOk());
    }
    @Test
    void getAllCoursesEmpty() throws Exception {
    when(courseManagement.getAllCourses()).thenReturn(Collections.emptyList());
    mockMvc.perform(get("/courses/"))
            .andExpect(status().isOk())
            .andExpect(content().json("[]"));
}
@Test
void addCourseFailure() throws Exception {
    String json = "{ \"name\": \"Test Course\", \"description\": \"Test Description\", \"duration\": 60 }";
    when(courseManagement.addCourse(any(Course.class))).thenThrow(new RuntimeException("Database error"));

    // assert the exception
    Exception exception = assertThrows(RuntimeException.class, () -> {
        mockMvc.perform(post("/courses/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));
    });

    assertEquals("Database error", exception.getMessage());
}
}