package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.dto.AddStudentDto;
import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.repository.StudentRepository;
import com.student.studentmanagement.service.serviceinterface.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto createStudent(AddStudentDto addStudentDto){
        Student student=modelMapper.map(addStudentDto,Student.class);
        Student newStudent=studentRepository.save(student);
        return modelMapper.map(newStudent,StudentDto.class);
    }

    @Override
    public StudentDto getStudentById(Long id){
        Student student=studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        return modelMapper.map(student,StudentDto.class);
    }
}
