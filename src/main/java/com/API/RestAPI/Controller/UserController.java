package com.API.RestAPI.Controller;

import com.API.RestAPI.Model.User;
import com.API.RestAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

@GetMapping("/Hi")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/User")
    public List<User> getUser() {
        return this.userService.getUsers();
    }

    @GetMapping("/User/{id}")
    public User getId(@PathVariable String id) {
        return this.userService.getId(id);
    }

}
