package com.skischool.course.domain;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {

    // Custom queries if needed...
}