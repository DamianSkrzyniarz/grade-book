package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.entity.User;
import eu.horyzont.gradebook.repository.StudentRepository;
import eu.horyzont.gradebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

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

    @GetMapping("/students/email/{email}")
    public Student studentByEmail(@PathVariable String email){
        return repository.findByAccountEmail(email);
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

    @PostMapping("/students/new")
    public Student createStudent(@RequestBody Student student){
        User newUser = new User();
        newUser.setEmail(student.getIndex() + "@uczelnia.com");
        newUser.setRoles("ROLE_STUDENT");
        newUser.setPassword(encoder.encode("test"));
        newUser.setActive(true);

        student.setAccount(userRepository.save(newUser));
        return repository.save(student);
    }

}
