package com.cricketCricketManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketCricketManagementSystem.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
