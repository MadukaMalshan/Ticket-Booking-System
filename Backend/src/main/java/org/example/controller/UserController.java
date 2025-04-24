package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Userdto;
import org.example.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/get-all")
    public List<Userdto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    public void createUser(@RequestBody Userdto userdto) {
        userService.createUser(userdto);
    }

    @GetMapping("/get-by-id/{id}")
    public Userdto getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody Userdto userdto) {
        userService.updateUser(userdto);
    }
}
