package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students/all")
    public List<Student> all(){
        return repository.findAll();
    }

    @GetMapping("/students/id/{id}")
    public Student studentById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @GetMapping("/students/index/{index}")
    public Student studentByIndex(@PathVariable int index){
        return repository.findByIndex(index);
    }

    @GetMapping("/students/major/{major}")
    public List<Student> studentsByMajor(@PathVariable String major){
        return repository.findAllByMajor(major);
    }

    @GetMapping("/students/semester/{semester}")
    public List<Student> studentsBySemester(@PathVariable String semester){
        return repository.findAllByMajor(semester);
    }

    @GetMapping("/students/search/{phrase}")
    public List<Student> searchStudents(@PathVariable String phrase){
        return repository.findByFirstNameOrLastNameContainingIgnoreCase(phrase, phrase);
    }

}
