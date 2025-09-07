package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.dto.ViewStudentDto;
import com.student.studentmanagement.entity.Course;
import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.repository.CourseRepository;
import com.student.studentmanagement.repository.StudentRepository;
import com.student.studentmanagement.service.serviceinterface.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto applyCourse(Long studentId,Long courseId){
        Student student=studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("Student not found"));
        Course course=courseRepository.findById(courseId).orElseThrow(()->new RuntimeException("Course not found"));

        student.getCourse().add(course);
        course.getStudent().add(student);

        studentRepository.save(student);
        courseRepository.save(course);

        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public List<ViewStudentDto> getStudentById(Long courseId){
        Course course=courseRepository.findById(courseId).orElseThrow(()->new RuntimeException("Course not found"));

        return course.getStudent().stream().map(student->modelMapper.map(student,ViewStudentDto.class)).toList();
    }
}
