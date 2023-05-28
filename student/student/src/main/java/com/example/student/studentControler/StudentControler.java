package com.example.student.studentControler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.student;
import com.example.student.studentService.studentService;

import java.io.IOException;
import java.util.List;

@RestController
public class StudentControler {
    private final studentService StudentService ;

    @Autowired
    public StudentControler(studentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<student> getStudents(@RequestParam int page, @RequestParam int size,
                                     @RequestParam(required = false) String filterColumn,
                                     @RequestParam(required = false) String filterValue) throws IOException {
        return studentService.getstudents(page, size, filterColumn, filterValue);
    }
}