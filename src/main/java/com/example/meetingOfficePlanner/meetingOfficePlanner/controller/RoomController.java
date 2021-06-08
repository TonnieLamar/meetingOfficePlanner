package com.example.meetingOfficePlanner.meetingOfficePlanner.controller;
import com.example.meetingOfficePlanner.meetingOfficePlanner.entity.Room;
import com.example.meetingOfficePlanner.meetingOfficePlanner.exception.RoomNotFoundException;
import com.example.meetingOfficePlanner.meetingOfficePlanner.repository.RoomRepository;
import com.example.meetingOfficePlanner.meetingOfficePlanner.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/")
public class RoomController {
    @Autowired
    private RoomService roomService;
        @Autowired
        private RoomRepository roomRepository;

        @PostMapping(value="/room")
        Room addNewRoom(@RequestBody Room room){
            return roomService.addRoom(room);
        }


        //
//    @GetMapping(value = "/user/{userId}") @PostMapping
////
////    @DeleteMapping
////    @PutMapping
        @GetMapping(value = "/room/{roomId}")
        public Room getSpecificUser(@PathVariable("roomId") int roomId) throws RoomNotFoundException {
            return roomService.getRoom(roomId);

        }

        @GetMapping("/rooms")
        public List<Room> getAllUsers(){
            return roomService.getRooms();
        }
        @PutMapping(value = "/room/{roomId}")
        public Room updateUser(@RequestBody Room room) throws RoomNotFoundException {
            return roomService.updateRoom(room.getRoomId(), room);
        }
        @DeleteMapping("/room/{roomId}")
        public ResponseEntity<?> deleteUser(@PathVariable(value = "roomId") int roomId) throws RoomNotFoundException {
            Room room = roomRepository.findById(roomId)
                    .orElseThrow(() -> new RoomNotFoundException(roomId));

            roomRepository.delete(room);

            return ResponseEntity.ok().build();
        }
//    @DeleteMapping (value = "/users/{id}")
//    public void  deleteStudent(@PathVariable(value="id") int userId)throws UserNotFoundException{
//        return UserService.deleteUser(userId);
//    }
    }

