package com.tictactoe.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public Room createRoom(@RequestParam Long roomId, @RequestParam String player1) {
        return roomService.createRoom(roomId, player1);
    }

    @PostMapping("/join/{roomId}")
    public Room joinRoom(@PathVariable Long roomId, @RequestParam String player2) {
        return roomService.joinRoom(roomId, player2);
    }

    @GetMapping("/isFull/{roomId}")
    public boolean isRoomFull(@PathVariable Long roomId) {
        return roomService.isRoomFull(roomId);
    }

    @GetMapping("/{roomId}")
    public Room getRoom(@PathVariable Long roomId) {
        return roomService.getRoom(roomId);
    }

    @GetMapping("/delete/{roomId}")
    public void deleteRoom(@PathVariable Long roomId) {
        roomService.deleteRoom(roomId);
    }

    @GetMapping("/deleteAll")
    public void deleteAllRooms() {
        roomService.deleteAllRooms();
    }

    @GetMapping("/exists/{roomId}")
    public boolean roomExists(@PathVariable Long roomId) {
        return roomService.roomExists(roomId);
    }
}
