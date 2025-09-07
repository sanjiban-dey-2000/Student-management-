package com.student.studentmanagement.service.serviceinterface;

import com.student.studentmanagement.dto.AddCourseDto;
import com.student.studentmanagement.dto.CourseDto;

public interface CourseService {
    CourseDto addCourse(AddCourseDto addCourseDto);

    CourseDto getCourseById(Long id);
}
