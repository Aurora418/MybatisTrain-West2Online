package com.aurora.mapper;

import com.aurora.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudentList();
    boolean deleteStudent(Student student);
    boolean addStudent(Student student);
    boolean updateStudent(@Param("Snum") String Snum,@Param("student") Student student);
    Student getStudent(String Snum);
}
