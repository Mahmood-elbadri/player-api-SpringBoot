package com.spring.playerapi.service;


import com.spring.playerapi.model.Player;

import java.util.List;


public interface PlayerService {

	List<Player> allPlayers();
	
	void savePlayer(Player player);
	
	Player showPlayer(int id);
	
	int deletePlayer(int id);
}
