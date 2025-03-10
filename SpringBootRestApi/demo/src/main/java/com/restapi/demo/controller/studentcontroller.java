package com.restapi.demo.controller;

import com.restapi.demo.entity.Student;
import com.restapi.demo.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class studentcontroller {
    //Get all the students
    @Autowired
    studentrepo repo;

    @GetMapping("/students")
    public List<Student>getAllStudent(){
        List<Student>students=repo.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student=repo.findById(id).get();
        return student;
    }

    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("/students/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        Optional<Student> optionalStudent = repo.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();

            // Update only the fields that are provided in the request body
            if (student.getStudent_name() != null && !student.getStudent_name().isEmpty()) {
                existingStudent.setStudent_name(student.getStudent_name());
            }
            if (student.getPercentage() != 0) { // Assuming 0 is not a valid percentage value
                existingStudent.setPercentage(student.getPercentage());
            }
            if (student.getBranch() != null && !student.getBranch().isEmpty()) {
                existingStudent.setBranch(student.getBranch());
            }

            // Save the updated entity
            Student updatedStudent = repo.save(existingStudent);

            return updatedStudent; // Returning the updated student details
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found with ID: " + id);
        }
    }

    @DeleteMapping("/students/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable int id, @RequestBody Student student) {
        Student delete= repo.findById(id).get();
        repo.delete(delete);
    }



}
