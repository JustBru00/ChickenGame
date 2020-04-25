package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameStateType;

public class InRoundSurviveState extends GameState {

	public InRoundSurviveState() {
		super(GameStateType.IN_ROUND_SURVIVE, -1);
	}

	@Override
	public void onStateStart() {
		// TODO SURVIVE ROUND START NOTIFY ROUNDMANAGER

	}

	@Override
	public void onStateEnd() {
		// Never called.
		// BuildManager handles state changes
	}

	@Override
	public void onEverySecondForever() {
		// TODO NOTIFY ROUNDMANAGER
		// ROUND MANAGER handles state changes.
	}

}
