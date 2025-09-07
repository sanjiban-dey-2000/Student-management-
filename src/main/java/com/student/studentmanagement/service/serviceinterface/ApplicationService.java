package com.student.studentmanagement.service.serviceinterface;

import com.student.studentmanagement.dto.AddCourseDto;
import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.dto.ViewStudentDto;

import java.util.List;

public interface ApplicationService {
    StudentDto applyCourse(Long studentId, Long courseId);

    List<ViewStudentDto> getStudentById(Long courseId);

    List<AddCourseDto> getCourseByStudentId(Long studentId);
}
