package com.patrik.beadando.student.Controller;

import com.patrik.beadando.student.Model.StudentClass;
import com.patrik.beadando.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="api/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentClass> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void postNewStudent(@RequestBody StudentClass student){
        studentService.addNewStudent(student);
    }
}
