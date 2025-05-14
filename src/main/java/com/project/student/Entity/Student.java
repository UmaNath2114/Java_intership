package com.project.student.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    //Id is primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String rollNo;
    private String email;

    public Student (){

      }

      public Student(Long id,String name,String rollNo,String email){
          this.name=name;
          this.rollNo=rollNo;
          this.email=email;
      }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRollNo(String rollNo){
        this.rollNo=rollNo;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
};


