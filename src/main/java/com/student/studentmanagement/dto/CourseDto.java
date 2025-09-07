package com.student.studentmanagement.dto;

import com.student.studentmanagement.entity.Student;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Long id;
    private String name;
    private int duration;
    private double price;
    private String description;
    private Set<StudentDto> student=new HashSet<>();
}
