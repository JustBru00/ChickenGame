package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameManager;
import com.justbru00.epic.chickengame.game.GameStateType;

public class ResetState extends GameState {

	public ResetState() {
		super(GameStateType.RESET, 2);
	}

	@Override
	public void onStateStart() {
		// TODO RESET STUFF
		// CLEAR MAP AREA
		// TELEPORT TO LOBBY
	}

	@Override
	public void onStateEnd() {
		GameManager.setCurrentState(GameStateType.WAIT);
	}

	@Override
	public void onEverySecondForever() {
		// Never called
	}

}
