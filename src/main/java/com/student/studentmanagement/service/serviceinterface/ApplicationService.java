package com.student.studentmanagement.service.serviceinterface;

import com.student.studentmanagement.dto.StudentDto;

public interface ApplicationService {
    StudentDto applyCourse(Long studentId, Long courseId);
}
