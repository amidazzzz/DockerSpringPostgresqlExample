package com.experto.springbootpostgresqldocker.controller;

import com.experto.springbootpostgresqldocker.model.User;
import com.experto.springbootpostgresqldocker.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/form")
    public String showForm(User user) {
        return "userForm";
    }

    @PostMapping("/form")
    public String createUser(User user) {
        userRepository.save(user);
        return "redirect:/users/list";
    }

    @GetMapping("/list")
    public String showUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "userList";
    }
}
