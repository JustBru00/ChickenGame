package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameStateType;

public class InRoundBuildState extends GameState {	

	public InRoundBuildState() {
		super(GameStateType.IN_ROUND_BUILD, -1);
	}

	@Override
	public void onStateStart() {
		// TODO BUILD ROUND STARTED
		// NOTIFY ROUNDMANAGER
	}

	@Override
	public void onStateEnd() {
		// Never called
		// BuildManager Handles changing to the Survive State
	}

	@Override
	public void onEverySecondForever() {
		// TODO Notify BUILDManagerevery second
		// BuildManager handles countdown etc.
		// 
	}

}
