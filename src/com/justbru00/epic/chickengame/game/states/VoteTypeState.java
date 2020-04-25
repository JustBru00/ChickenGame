package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameManager;
import com.justbru00.epic.chickengame.game.GameStateType;

public class VoteTypeState extends GameState {

	public VoteTypeState() {
		super(GameStateType.VOTE_TYPE, 20);
	}

	@Override
	public void onStateStart() {
		// TODO ANNOUNCE VOTE
		// OPEN INVENTORIES
		// TELL MAPMANAGER TO CHOOSE AND LOAD THE MAP.
	}

	@Override
	public void onStateEnd() {
		// TODO FIND VOTE WINNER
		// LET THE ROUNDMANAGER KNOW ABOUT IT
		GameManager.setCurrentState(GameStateType.IN_ROUND_BUILD);
	}

	@Override
	public void onEverySecondForever() {
		// Never called 
	}

}
