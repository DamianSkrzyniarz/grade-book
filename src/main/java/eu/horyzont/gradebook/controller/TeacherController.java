package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.entity.Teacher;
import eu.horyzont.gradebook.entity.User;
import eu.horyzont.gradebook.repository.TeacherRepository;
import eu.horyzont.gradebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository repository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/teachers/all")
    public List<Teacher> all() {
        return repository.findAll();
    }

    @GetMapping("/teachers/id/{id}")
    public Teacher teacherById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PostMapping("/teachers/new")
    public Teacher createTeacher(@RequestBody Teacher teacher){
        User newUser = new User();
        newUser.setEmail(teacher.getFirstName() + teacher.getLastName() + "@uczelnia.com");
        newUser.setRoles("ROLE_TEACHER");
        newUser.setPassword(encoder.encode("test"));
        newUser.setActive(true);

        teacher.setAccount(userRepository.save(newUser));
        return repository.save(teacher);
    }
}
