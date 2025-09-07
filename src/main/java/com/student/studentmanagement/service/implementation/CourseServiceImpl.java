package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.repository.CourseRepository;
import com.student.studentmanagement.service.serviceinterface.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

}
