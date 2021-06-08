package com.example.meetingOfficePlanner.meetingOfficePlanner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Room {
    @Id
    @GeneratedValue
    int roomId;
    int capacity;
    String roomName;
    String tvDescription;
    String whiteBoardDescription;
    String phoneConferenceDescription;
    Room(){}

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", capacity=" + capacity +
                ", roomName='" + roomName + '\'' +
                ", tvDescription='" + tvDescription + '\'' +
                ", whiteBoardDescription='" + whiteBoardDescription + '\'' +
                ", phoneConferenceDescription='" + phoneConferenceDescription + '\'' +
                '}';
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Room(String roomName, String tvDescription, String whiteBoardDescription, String phoneConferenceDescription) {
        this.roomName = roomName;
        this.tvDescription = tvDescription;
        this.whiteBoardDescription = whiteBoardDescription;
        this.phoneConferenceDescription = phoneConferenceDescription;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getTvDescription() {
        return tvDescription;
    }

    public void setTvDescription(String tvDescription) {
        this.tvDescription = tvDescription;
    }

    public String getWhiteBoardDescription() {
        return whiteBoardDescription;
    }

    public void setWhiteBoardDescription(String whiteBoardDescription) {
        this.whiteBoardDescription = whiteBoardDescription;
    }

    public String getPhoneConferenceDescription() {
        return phoneConferenceDescription;
    }

    public void setPhoneConferenceDescription(String phoneConferenceDescription) {
        this.phoneConferenceDescription = phoneConferenceDescription;
    }
}
