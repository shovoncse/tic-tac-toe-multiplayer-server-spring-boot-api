package com.tictactoe.game;

import org.springframework.data.jpa.repository.JpaRepository;
public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByRoomId(Long roomId);
    void deleteByRoomId(Long roomId);
    boolean existsByRoomId(Long roomId);
}
