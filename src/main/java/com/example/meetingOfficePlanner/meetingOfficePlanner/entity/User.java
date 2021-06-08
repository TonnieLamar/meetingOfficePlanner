package com.example.meetingOfficePlanner.meetingOfficePlanner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    int userId;
    String username;
    String password;
    String StakeholderPosition;
    String email;
    String phoneNumber;
    public User(){
        super();
    }
    public  User(String username, String password,String email,String phoneNumber,String StakeholderPosition){
        super();
       // this.userId=userId;
        this.email=email;
        this.username=username;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.StakeholderPosition=StakeholderPosition;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStakeholderPosition() {
        return StakeholderPosition;
    }

    public void setStakeholderPosition(String stakeholderPosition) {
        StakeholderPosition = stakeholderPosition;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", StakeholderPosition='" + StakeholderPosition + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
