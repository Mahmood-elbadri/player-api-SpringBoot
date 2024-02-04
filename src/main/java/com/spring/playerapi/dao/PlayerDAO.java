package com.spring.playerapi.dao;

import com.spring.playerapi.model.Player;

import java.util.List;




public interface PlayerDAO {
	
	public List<Player> getPlayers();
	
	public void addPlayers(Player player);
	
	public Player getPlayer(int id);
	
	public int removePlayer(int id);
}
