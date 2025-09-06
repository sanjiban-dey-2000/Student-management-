package com.student.studentmanagement.dto;

import com.student.studentmanagement.entity.GenderType;
import com.student.studentmanagement.entity.Student;
import lombok.*;

import java.time.LocalDate;
import java.util.function.Function;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private LocalDate dateOfBirth;
    private GenderType gender;
}
