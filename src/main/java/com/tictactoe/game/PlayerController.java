package com.tictactoe.game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/all")
    public List<String> getAllPlayerNames() {
        List<Player> players = playerService.getAllPlayers();
        List<String> names = new ArrayList<>();
        for (Player player : players) {
            names.add(player.getName());
        }
        return names;
    }
    
    @PostMapping
    public Player createPlayer(@RequestParam String name, @RequestParam Long roomId) {
        return playerService.createPlayer(name, roomId);
    }

    @GetMapping("/room/{roomId}")
    public List<Player> getPlayersInRoom(@PathVariable Long roomId) {
        return playerService.getPlayersInRoom(roomId);
    }
}
