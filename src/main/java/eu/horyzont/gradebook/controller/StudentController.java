package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students/all")
    public List<Student> all(){
        return repository.findAll();
    }
}
