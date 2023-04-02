package com.cricketCricketManagementSystem.service;

import java.util.List;

import com.cricketCricketManagementSystem.model.Player;

public interface IPlayerService {
	public List<Player> getAllPlayer();
	public Player save(Player player);
	public Player updatePlayer(int playerId,Player player);
	public void deletePlayerById(int playerId);

}
