package com.example.springboot1.course.bean;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> { // entity and id type

}
