package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Course;
import eu.horyzont.gradebook.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses/all")
    public List<Course> all() {
        return repository.findAll();
    }
}
