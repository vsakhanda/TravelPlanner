package com.dreams_2.project.controller;

import com.dreams_2.project.model.User;
import com.dreams_2.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/api/v1/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/admin")
    public String getAdminInfo() {
        return "Hello admin";
    }

    @GetMapping("/info")
    public String getUser() {
        return "Hello user";
    }

    @GetMapping("/public")
    public String publicinfo() {
        return "Public info - hello java world!";
    }

    @GetMapping("/parameter/{userId}")
    public ResponseEntity<User> getParameter(@PathVariable("userId") int userId) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(service.getById(userId));
    }

    @GetMapping("/requestparameter")
    public ResponseEntity<User> getByRequestParam(@RequestParam("userId") int userId) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(service.getById(userId));
    }

    @PostMapping("/requestBody")
    public ResponseEntity<User> postUser(@RequestBody User user) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(service.add(user));

    }
}


