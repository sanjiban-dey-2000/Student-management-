package com.student.studentmanagement.service.implementation;

import com.student.studentmanagement.dto.AddCourseDto;
import com.student.studentmanagement.dto.CourseDto;
import com.student.studentmanagement.entity.Course;
import com.student.studentmanagement.repository.CourseRepository;
import com.student.studentmanagement.service.serviceinterface.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    @Override
    public CourseDto addCourse(AddCourseDto addCourseDto){
        Course course=modelMapper.map(addCourseDto,Course.class);
        Course newCourse=courseRepository.save(course);
        return modelMapper.map(newCourse,CourseDto.class);
    }

    @Override
    public CourseDto getCourseById(Long id){
        Course course=courseRepository.findById(id).orElseThrow(()->new RuntimeException("Course not found with id "+id));
        return modelMapper.map(course,CourseDto.class);
    }

}
