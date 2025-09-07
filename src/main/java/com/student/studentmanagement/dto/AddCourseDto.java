package com.student.studentmanagement.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddCourseDto {
    private Long id;
    private String name;
    private int duration;
    private double price;
    private String description;
}
