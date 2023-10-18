package com.tictactoe.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(Long roomId, String player1) {
        Room room = new Room();
        room.setRoomId(roomId);
        room.setPlayer1(player1);
        return roomRepository.save(room);
    }

    public Room joinRoom(Long roomId, String player2) {
        Room room = roomRepository.findByRoomId(roomId);
        room.setPlayer2(player2);
        return roomRepository.save(room);
    }

    public boolean isRoomFull(Long roomId) {
        Room room = roomRepository.findByRoomId(roomId);
        return room.getPlayer2() != null;
    }
}
