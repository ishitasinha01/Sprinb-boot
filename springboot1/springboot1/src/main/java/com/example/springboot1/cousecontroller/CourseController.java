package com.example.springboot1.cousecontroller;

import com.example.springboot1.course.bean.Course;
import com.example.springboot1.course.bean.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;
    // http://localhost:8080/courses when user requests
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
    //    return Arrays.asList(new Course(1,"Learn Microservices", "in one go "),
     //         new Course(2,"Learn full stack","in min"));
    return new ArrayList<>();
    }
    public List<Course> getAllCourses1(){
        int a=10;
        return repository.findAll();// many other operations
    }
    // another url which will have url
    // http://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public List<Course> getCourseDetails(@PathVariable long id){
       Optional <Course> course = repository.findById(id);
       if(course.isEmpty()){
           throw new RuntimeException("Course not found with id "+id);
       }
        return (List<Course>) course.get();
//        return Arrays.asList(new Course(1,"Learn microservices","in28min"));
    }
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course); // use  a rest api client talent api tesdter
    }
    @PatchMapping("/courses/{id}")
    public void updateCourse( long id, @RequestBody Course course){
        repository.save(course);
    }
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        repository.deleteById(id);
    }
//    docker run --detach
//    --env MYSQL_ROOT_PASSWORD=dummypassword
//    --env MYSQL_USER=courses-user
//    --env MYSQL_PASSWORD=joddw
//    -- MYSQL_DATABASE=courses
//    --name mysql
//    publish 3306:idsdo mysql :57

}
