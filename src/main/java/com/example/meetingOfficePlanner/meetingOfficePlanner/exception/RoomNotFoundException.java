package com.example.meetingOfficePlanner.meetingOfficePlanner.exception;

public class RoomNotFoundException
    extends Exception{
        private int roomId;
    public RoomNotFoundException(int roomId){
            super(String.format("room not found with id '%s'",roomId));
        }
}
