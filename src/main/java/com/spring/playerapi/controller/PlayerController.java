package com.spring.playerapi.controller;

import com.spring.playerapi.exception.PlayerException;
import com.spring.playerapi.model.Player;
import com.spring.playerapi.model.PlayerError;
import com.spring.playerapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.allPlayers();
    }
    //    @GetMapping("/players/{id}")
//    public Player getPlayer(@PathVariable int id){
//        return playerService.showPlayer(id);
//    }
    @GetMapping("/player")
    public Player getPlayer(@RequestParam int id) {
        Player player = playerService.showPlayer(id);
        if (player == null) {
            throw new PlayerException("player not found");
        }
        return playerService.showPlayer(id);
    }

    @PostMapping("/players")
    public void savePlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
    }

    @PutMapping("/players")
    public void editPlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable int id) {
        int result = playerService.deletePlayer(id);
        if (result == 0) {
            throw new PlayerException("player Not found");
        }
    }


}
