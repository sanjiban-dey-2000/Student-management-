package com.student.studentmanagement.controller;

import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.service.serviceinterface.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping("/application/{studentId}/{courseId}/course")
    public ResponseEntity<StudentDto> applyCourse(@PathVariable Long studentId,@PathVariable Long courseId){
        return ResponseEntity.status(HttpStatus.OK).body(applicationService.applyCourse(studentId,courseId));
    }
}
