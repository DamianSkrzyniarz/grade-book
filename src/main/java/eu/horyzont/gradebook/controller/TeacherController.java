package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.entity.Teacher;
import eu.horyzont.gradebook.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository repository;

    @GetMapping("/teachers/all")
    public List<Teacher> all() {
        return repository.findAll();
    }

    @GetMapping("/teachers/id/{id}")
    public Teacher teacherById(@PathVariable int id){
        return repository.findById(id).get();
    }
}
