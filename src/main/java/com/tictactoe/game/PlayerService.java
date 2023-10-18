package com.tictactoe.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(String name, Long roomId) {
        Player player = new Player();
        player.setName(name);
        player.setRoomId(roomId);
        return playerRepository.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersInRoom(Long roomId) {
        return playerRepository.findByRoomId(roomId);
    }
}
