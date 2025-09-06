package com.student.studentmanagement.service.serviceinterface;

import com.student.studentmanagement.dto.AddStudentDto;
import com.student.studentmanagement.dto.StudentDto;

public interface StudentService {

    StudentDto createStudent(AddStudentDto addStudentDto);

    StudentDto getStudentById(Long id);
}
