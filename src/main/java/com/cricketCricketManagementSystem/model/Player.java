package com.cricketCricketManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cricket")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="player_id")
	private int playerId;
	@Column(name="player_name")
	private String playerName;
	@Column(name="player_score")
	private int playerScore;
	
	

}
