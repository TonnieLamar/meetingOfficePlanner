package com.example.meetingOfficePlanner.meetingOfficePlanner.repository;

import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.Room;
import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository  extends JpaRepository<Room,Integer> {
}
