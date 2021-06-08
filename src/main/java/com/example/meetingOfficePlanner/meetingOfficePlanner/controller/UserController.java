package com.example.meetingOfficePlanner.meetingOfficePlanner.controller;

import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.User;
import com.example.meetingOfficePlanner.meetingOfficePlanner.exception.UserNotFoundException;
import com.example.meetingOfficePlanner.meetingOfficePlanner.repository.UserRepository;
import com.example.meetingOfficePlanner.meetingOfficePlanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @PostMapping(value="/user")

    User addNewUser(@RequestBody User user){
        return userService.addUser(user);
    }


//
//    @GetMapping(value = "/user/{userId}") @PostMapping
////
////    @DeleteMapping
////    @PutMapping
@GetMapping(value = "/user/{userId}")
public User getSpecificUser(@PathVariable("userId") int userId) throws UserNotFoundException {
    return userService.getUser(userId);

}

    @GetMapping("/users")
            public List<User> getAllUsers(){
        return userService.getUsers();
    }
    @PutMapping(value = "/user/{userId}")
    public User updateUser(@RequestBody User user) throws UserNotFoundException {
        return userService.updateUser(user.getUserId(), user);
    }
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "userId") int userId) throws UserNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        userRepository.delete(user);

        return ResponseEntity.ok().build();
    }
//    @DeleteMapping (value = "/users/{id}")
//    public void  deleteStudent(@PathVariable(value="id") int userId)throws UserNotFoundException{
//        return UserService.deleteUser(userId);
//    }
}

