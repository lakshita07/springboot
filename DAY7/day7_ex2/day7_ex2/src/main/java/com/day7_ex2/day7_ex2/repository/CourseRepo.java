package com.day7_ex2.day7_ex2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day7_ex2.day7_ex2.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
    List<Course> findByCourseName(String courseName);
}