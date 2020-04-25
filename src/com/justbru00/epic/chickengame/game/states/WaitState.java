package com.justbru00.epic.chickengame.game.states;

import org.bukkit.Bukkit;

import com.justbru00.epic.chickengame.game.GameManager;
import com.justbru00.epic.chickengame.game.GameStateType;

public class WaitState extends GameState {

	public WaitState() {
		super(GameStateType.WAIT, -1);
	}

	@Override
	public void onStateStart() {
		// DO NOTHING ATM
	}

	@Override
	public void onStateEnd() {
		GameManager.setCurrentState(GameStateType.VOTE_TYPE);
	}

	@Override
	public void onEverySecondForever() {
		
		int playerCount = Bukkit.getOnlinePlayers().size();

		// Maximum 10 players
		if (playerCount == 10) {
			// Start right away bois
			GameManager.setTimerRemaining(1);
			return;
		} else if (playerCount < 10 && playerCount > 1) {
			GameManager.setTimerRemaining(30);
			return;
		}
	}

}
