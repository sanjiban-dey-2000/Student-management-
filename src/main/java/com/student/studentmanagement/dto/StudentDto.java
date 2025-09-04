package com.student.studentmanagement.dto;

import com.student.studentmanagement.entity.GenderType;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private int phone;
    private String email;
    private LocalDate dateOfBirth;
    private GenderType gender;
}
