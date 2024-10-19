package edu.iuh.fit.zy2.controllers;

import edu.iuh.fit.zy2.entities.User;
import edu.iuh.fit.zy2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        if (userService.checkLogin(user.getUsername(), user.getPassword())) {
            return ResponseEntity.ok("Login success");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }
}
