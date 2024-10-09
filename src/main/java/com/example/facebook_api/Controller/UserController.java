package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.User;
import com.example.facebook_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/userService")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public User saveUserData(@RequestBody User user) {
        return userService.submitMetaDataOfUser(user);
    }

    @GetMapping("/retrieveAllUserDetails")
    public ArrayList<User> retrieveAllUserDetails() {
        return userService.retrieveALlUserDetails();
    }

    @GetMapping("/getAllUsers/{userId}")
    public User retrieveUserDetailsById(@PathVariable("userId")String userID) {
        return userService.getUserData(userID);
    }
}
