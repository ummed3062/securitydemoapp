package com.mru.securitydemoapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mru.securitydemoapp.dto.RegisterRequest;
import com.mru.securitydemoapp.entity.User;
import com.mru.securitydemoapp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {

        Optional<User> optionalUser = repository.findByUsername(
                request.getUsername());

        if (optionalUser.isPresent()) {
            return "Username Already Exists";
        }

        User user = new User();

        user.setName(request.getName());
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        repository.save(user);
        return "Registration Successful";
    }
}
