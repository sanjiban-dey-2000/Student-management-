package com.student.studentmanagement.controller;

import com.student.studentmanagement.dto.AddCourseDto;
import com.student.studentmanagement.dto.CourseDto;
import com.student.studentmanagement.service.serviceinterface.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/course/add")
    public ResponseEntity<CourseDto> addCourse(@RequestBody AddCourseDto addCourseDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.addCourse(addCourseDto));
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getCourseById(id));
    }
}
