package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.entity.User;
import eu.horyzont.gradebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    @PostMapping("/users/new")
    public User createUser(@RequestBody User user){
        user.setPassword(encoder.encode(user.getPassword()));
        user.setActive(true);
        return repository.save(user);
    }

    @PutMapping("/users/edit")
    public User editUser(@RequestBody User user){
        User oldUser = repository.findByEmail(user.getEmail());
        System.out.println(oldUser);
        oldUser.setPassword(encoder.encode(user.getPassword()));
        return repository.save(oldUser);
    }

}
