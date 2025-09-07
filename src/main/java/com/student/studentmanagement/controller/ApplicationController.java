package com.student.studentmanagement.controller;

import com.student.studentmanagement.service.serviceinterface.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

}
