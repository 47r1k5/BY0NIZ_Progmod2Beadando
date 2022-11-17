package com.patrik.beadando.student.Service;

import com.patrik.beadando.student.Controller.XMLFile;
import com.patrik.beadando.student.Model.StudentClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<StudentClass> getStudents(){
        return XMLFile.XMLReader();
    }

    public void addNewStudent(StudentClass student){
        System.out.println(student);
    }
}
