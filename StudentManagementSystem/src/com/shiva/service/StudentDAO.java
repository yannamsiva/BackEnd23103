package com.shiva.service;

import java.util.List;

import com.shiva.pojo.Student;

public interface StudentDAO {
public String addStudent(Student student);
public List<Student>viewAllStudents();
public Student viewStudent(Integer sno);
public void deleteStudent(Integer sno);
}
