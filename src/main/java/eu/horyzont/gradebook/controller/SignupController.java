package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Signup;
import eu.horyzont.gradebook.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class SignupController {

    @Autowired
    private SignupRepository repository;

    @GetMapping("/signups/student/email/{email}")
    public List<Signup> getSignupsByStudentEmail(@PathVariable String email){

        return repository.findByStudentAccountEmail(email);
    }
    @GetMapping("/signups/student/id/{id}")
    public List<Signup> getSignupsByStudentId(@PathVariable int id){

        return repository.findByStudentId(id);
    }

    @GetMapping("/signups/course/{id}")
    public List<Signup> getSignupsByCourseId(@PathVariable int id){

        return repository.findByCourseId(id);
    }
}
