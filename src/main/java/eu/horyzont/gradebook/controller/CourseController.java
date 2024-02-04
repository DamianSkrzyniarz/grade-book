package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Course;
import eu.horyzont.gradebook.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses/all")
    public List<Course> all() {
        return repository.findAll();
    }

    @GetMapping("/courses/teacher/{email}")
    public List<Course> getCoursesByTeacherEmail(@PathVariable String email) {
        return repository.findByTeacherAccountEmail(email);
    }

    @GetMapping("/courses/{id}")
    public Course findById(@PathVariable int id) {
        System.out.println(id);
        return repository.findById(id).get();
    }

    @PostMapping("/courses/new")
    public Course createCourse(@RequestBody Course course){
        return repository.save(course);
    }
}
