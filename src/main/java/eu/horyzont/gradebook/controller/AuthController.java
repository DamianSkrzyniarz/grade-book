package eu.horyzont.gradebook.controller;

import eu.horyzont.gradebook.service.TokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class AuthController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public String login(Authentication authentication){
        return tokenService.generateToken(authentication);
    }
}
