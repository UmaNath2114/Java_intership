package com.project.student.Contoller;


import com.project.student.Entity.Student;
import com.project.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/api/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add-student")
    public  HashMap<String,Object> addStudent(@RequestBody Student s){
        HashMap<String,Object> response = new HashMap<String,Object>();
        try{
            Student addedStudent = service.addStudentDetails(s);
            response.put("Message","Student added successfully");
            response.put("Student name",addedStudent);
            return response;
        }
        catch(Exception e){
            response.put("error","Some error occured");
                    return response;
        }

    }
   @GetMapping("/get-student")
public  HashMap<String,Object> getStudentData(){
    HashMap<String, Object> response = new HashMap<String,Object>();
    try {
        List<Student> presentStudent = service.getStudentDataDetails();
        response.put("Message", "Student Data Fetched successfully");
        response.put("Student name", presentStudent);
        return response;
    } catch (Exception e) {
        response.put("error", "Some error occured");
        return response;
    }
  }
  @DeleteMapping("/deleted-student")
    public HashMap<String,Object> deleteStudent(@RequestParam Long id){
        HashMap<String, Object> response = new HashMap<String,Object>();
        try {
             Boolean deleteStudent= service.deleteStudentDetails(id);
             response.put("Message","Student Data Deleted Successfully");
             response.put("Deleted",deleteStudent);
             return response;
        }
        catch (Exception e){
            response.put("error",e.getMessage());
            return response;
        }
  }
  @PutMapping("/update-student")
    public HashMap<String,Object> updateStudent(@RequestParam Long id,@RequestBody Student s){
        HashMap<String,Object> response = new HashMap<String,Object>();
        try {
            Student updateStudent= service.updateStudentDetails(id,s);
            response.put("message","Student Data Updated Successfully");
            response.put("updated student",updateStudent);
            return response;
        }
        catch(Exception e){
             response.put("error",e.getMessage());
             return response;
        }
  }
}





