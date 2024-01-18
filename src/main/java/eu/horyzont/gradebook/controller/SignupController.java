package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Signup;
import eu.horyzont.gradebook.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignupController {

    @Autowired
    private SignupRepository repository;

    @GetMapping("/signup/student/{studentId}")
    public List<Signup> getSignupsByStudent(@PathVariable int studentId){

        return repository.findByStudentId(studentId);
    }
}
