package com.student.studentmanagement.controller;

import com.student.studentmanagement.dto.CourseDto;
import com.student.studentmanagement.service.serviceinterface.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/course/add")
    public ResponseEntity<CourseDto> addCourse()
}
