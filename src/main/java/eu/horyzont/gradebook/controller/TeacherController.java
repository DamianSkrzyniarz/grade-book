package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Teacher;
import eu.horyzont.gradebook.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository repository;

    @GetMapping("/teachers/all")
    public List<Teacher> all() {
        return repository.findAll();
    }
}
