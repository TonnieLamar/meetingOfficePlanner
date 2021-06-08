package com.example.meetingOfficePlanner.meetingOfficePlanner.service;
import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.Room;
import com.example.meetingOfficePlanner.meetingOfficePlanner.exception.RoomNotFoundException;
import com.example.meetingOfficePlanner.meetingOfficePlanner.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public RoomService() {
    }

    public List<Room> getRooms(){
        return roomRepository.findAll();

    }
    public Room getRoom(int roomid) throws RoomNotFoundException {
        return roomRepository.findById(roomid).orElseThrow(()->new RoomNotFoundException(roomid));

    }
    public Room addRoom(Room room){
        return roomRepository.save(room);
    }
    public Room updateRoom(int roomid,Room roomDetails) throws RoomNotFoundException {
        Room room=roomRepository.findById(roomid).orElseThrow(()-> new RoomNotFoundException(roomid));
        room.setCapacity(roomDetails.getCapacity());
        room.setPhoneConferenceDescription(roomDetails.getPhoneConferenceDescription());
        room.setRoomId(roomDetails.getRoomId());
        room.setRoomName(roomDetails.getRoomName());
        room.setTvDescription(roomDetails.getTvDescription());
        room.setWhiteBoardDescription(roomDetails.getWhiteBoardDescription());
        Room updatedRoom=roomRepository.save(room);
        return updatedRoom;
    }
}
