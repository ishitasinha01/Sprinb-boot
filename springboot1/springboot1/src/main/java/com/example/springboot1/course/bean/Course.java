package com.example.springboot1.course.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Course1")
public class Course {
    // have three fields
@Id
@GeneratedValue
    private long id;
@Column(name="course_name")
    private String name;
    private String author;
    public Course(){

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name="+ name +", author=" + author + "]";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
