package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.dto.AddStudentDto;
import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.repository.StudentRepository;
import com.student.studentmanagement.service.serviceinterface.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(AddStudentDto addStudentDto){

    }
}
