package com.cricketCricketManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketCricketManagementSystem.model.Player;
import com.cricketCricketManagementSystem.repository.PlayerRepository;

@Service

public class PlayerService implements IPlayerService {
	@Autowired
	private PlayerRepository playerRepo;

	@Override
	public List<Player> getAllPlayer() {
		
		return playerRepo.findAll();
	}

	@Override
	public Player save(Player player) {
		
		return playerRepo.save(player);
	}

	@Override
	public Player updatePlayer(int playerId, Player player) {
		
		return playerRepo.save(player);
	}

	@Override
	public void deletePlayerById(int playerId) {
		playerRepo.deleteById(playerId);
		
	}

	

}
