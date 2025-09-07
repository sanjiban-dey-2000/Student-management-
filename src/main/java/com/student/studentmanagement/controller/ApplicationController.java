package com.student.studentmanagement.controller;

import com.student.studentmanagement.dto.AddCourseDto;
import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.dto.ViewStudentDto;
import com.student.studentmanagement.service.serviceinterface.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping("/application/{studentId}/{courseId}/course")
    public ResponseEntity<StudentDto> applyCourse(@PathVariable Long studentId,@PathVariable Long courseId){
        return ResponseEntity.status(HttpStatus.OK).body(applicationService.applyCourse(studentId,courseId));
    }

    @GetMapping("/course/{courseId}/students")
    public ResponseEntity<List<ViewStudentDto>> getStudentById(@PathVariable Long courseId){
        return ResponseEntity.status(HttpStatus.OK).body(applicationService.getStudentById(courseId));
    }

    @GetMapping("/student/{studentId}/course")
    public ResponseEntity<List<AddCourseDto>> getCourseByStudentId(@PathVariable Long studentId){
        return ResponseEntity.status(HttpStatus.OK).body(applicationService.getCourseByStudentId(studentId));
    }
}
