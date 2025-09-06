package com.student.studentmanagement.service.serviceinterface;

import com.student.studentmanagement.dto.AddStudentDto;
import com.student.studentmanagement.dto.StudentDto;

import java.util.List;

public interface StudentService {

    StudentDto createStudent(AddStudentDto addStudentDto);

    StudentDto getStudentById(Long id);

    List<StudentDto> getAllStudents();

    StudentDto updateStudentById(Long id, AddStudentDto addStudentDto);
}
