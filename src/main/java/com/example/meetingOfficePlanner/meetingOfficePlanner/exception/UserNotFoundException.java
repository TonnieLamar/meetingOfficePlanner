package com.example.meetingOfficePlanner.meetingOfficePlanner.exception;

public class UserNotFoundException extends Exception{
    private int userId;
    public UserNotFoundException(int userId){
        super(String.format("user not found with id '%s'",userId));
    }
}
