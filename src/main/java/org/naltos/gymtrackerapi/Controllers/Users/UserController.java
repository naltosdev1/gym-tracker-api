package org.naltos.gymtrackerapi.Controllers.Users;

import org.naltos.gymtrackerapi.DTO.UserDto.UserDto;
import org.naltos.gymtrackerapi.Entity.User;
import org.naltos.gymtrackerapi.Services.Users.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired private UserServiceImpl userService;

    @PostMapping({"", "/"})
    public User saveUser(@Validated @RequestBody UserDto user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId) {
        return userService.getUser(userId);
    }
}
