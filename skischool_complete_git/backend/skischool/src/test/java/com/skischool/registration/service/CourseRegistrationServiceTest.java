package com.skischool.registration.service;

import com.skischool.registration.domain.CourseRegistration;
import com.skischool.registration.logic.CourseRegistrationManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CourseRegistrationServiceTest {

    @MockBean
    private CourseRegistrationManagement courseRegistrationManagement;

    private CourseRegistrationService courseRegistrationService;

    @BeforeEach
    public void setup() {
        courseRegistrationService = new CourseRegistrationService(courseRegistrationManagement);
    }

    @Test
    public void testGetAllRegistrations() {
        CourseRegistration reg1 = new CourseRegistration();
        CourseRegistration reg2 = new CourseRegistration();

        when(courseRegistrationManagement.getAllRegistrations())
                .thenReturn(Arrays.asList(reg1, reg2));

        List<CourseRegistration> registrations = courseRegistrationService.getAllRegistrations();
        assertEquals(2, registrations.size());
    }

    @Test
    public void testRegisterMemberForCourse() {
        CourseRegistration registration = new CourseRegistration();

        when(courseRegistrationManagement.registerMemberForCourse(any(CourseRegistration.class)))
                .thenReturn(registration);

        CourseRegistration createdRegistration = courseRegistrationService.registerMemberForCourse(registration);
        assertNotNull(createdRegistration);
    }

    @Test
    public void testRegisterMemberForCourse_Failure() {
        CourseRegistration registration = new CourseRegistration();

        when(courseRegistrationManagement.registerMemberForCourse(any(CourseRegistration.class)))
                .thenThrow(new RuntimeException("Unexpected error"));

        assertThrows(RuntimeException.class, () -> {
            courseRegistrationService.registerMemberForCourse(registration);
        });
    }
}