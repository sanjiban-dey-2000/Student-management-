package com.student.studentmanagement.controller;

import com.student.studentmanagement.dto.AddStudentDto;
import com.student.studentmanagement.dto.StudentDto;
import com.student.studentmanagement.service.serviceinterface.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/student/create_student")
    public ResponseEntity<StudentDto> createStudent(@RequestBody AddStudentDto addStudentDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(addStudentDto));
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PutMapping("/student/{id}/update")
    public ResponseEntity<StudentDto> updateStudentById(@PathVariable Long id,@RequestBody AddStudentDto addStudentDto){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.updateStudentById(id,addStudentDto));
    }

}
