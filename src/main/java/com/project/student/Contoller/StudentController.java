package com.project.student.Contoller;


import com.project.student.Entity.Student;
import com.project.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/api/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add-student")
    public  HashMap<String,String> addStudent(@RequestBody Student s){
        HashMap<String,String> response = new HashMap<String,String>();
        try{
            Student addedStudent = service.addStudentDetails(s);
            response.put("Message","Student added successfully");
            response.put("Student name",addedStudent.getName());
            return response;
        }
        catch(Exception e){
            response.put("error","Some error occured");
                    return response;
        }

    }
   @GetMapping("/add-student1")
public  HashMap<String,String> getStudentData(){
    HashMap<String, String> response = new HashMap<String, String>();
    try {
        List<Student> PresentStudent = service.getStudentDataDetails();
        response.put("Message", "Student Data Fetched successfully");
        response.put("Student name", PresentStudent.toString());
        return response;
    } catch (Exception e) {
        response.put("error", "Some error occured");
        return response;
    }
}
}





