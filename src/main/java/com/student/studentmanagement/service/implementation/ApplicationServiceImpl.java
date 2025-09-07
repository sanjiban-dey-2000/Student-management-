package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.repository.CourseRepository;
import com.student.studentmanagement.repository.StudentRepository;
import com.student.studentmanagement.service.serviceinterface.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;
}
