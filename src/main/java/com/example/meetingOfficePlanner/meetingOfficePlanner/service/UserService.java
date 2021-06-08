package com.example.meetingOfficePlanner.meetingOfficePlanner.service;

import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.User;
import com.example.meetingOfficePlanner.meetingOfficePlanner.exception.UserNotFoundException;
import com.example.meetingOfficePlanner.meetingOfficePlanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
   public List<User> getUsers(){
        return userRepository.findAll();

   }
    public User getUser(int userid) throws UserNotFoundException {
        return userRepository.findById(userid).orElseThrow(()->new UserNotFoundException(userid));

    }
    public User addUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(int userid,User userDetails) throws UserNotFoundException {
        User user=userRepository.findById(userid).orElseThrow(()-> new UserNotFoundException(userid));
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setPhoneNumber(userDetails.getPhoneNumber());
        user.setStakeholderPosition(userDetails.getStakeholderPosition());
        user.setUserId(userDetails.getUserId());
        user.setUsername(userDetails.getUsername());
        User updatedUser=userRepository.save(user);
        return updatedUser;
    }

}
