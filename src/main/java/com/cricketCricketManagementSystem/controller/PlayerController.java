package com.cricketCricketManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketCricketManagementSystem.model.Player;
import com.cricketCricketManagementSystem.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	
	private PlayerService playerService;
	
	@GetMapping("/getAllPlayer")
	public List<Player> getAllPlayer(){
		return playerService.getAllPlayer();
	}
	@PostMapping("/save")
	public Player addPlayer(@RequestBody Player player) {
		return playerService.save(player);
	}
	@PutMapping("/save/{playerId}")
	public Player updatePlayer(@PathVariable ("playerId") int playerId,@RequestBody Player player) {
		return playerService.updatePlayer(playerId,player);
	}
	@DeleteMapping("/save/{playerId}")
	public String deletePlayerById(@PathVariable("playerId") int playerId) {
		playerService.deletePlayerById(playerId);
		return "Deleted Successfully";
	}

}
