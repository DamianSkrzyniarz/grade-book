package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Grade;
import eu.horyzont.gradebook.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeController {

    @Autowired
    private GradeRepository repository;

    @GetMapping("/grades/all")
    public List<Grade> all(){
        return repository.findAll();
    }
}
