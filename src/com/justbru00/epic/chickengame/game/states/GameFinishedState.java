package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameManager;
import com.justbru00.epic.chickengame.game.GameStateType;

public class GameFinishedState extends GameState {

	public GameFinishedState() {
		super(GameStateType.GAME_FINISHED, 10);
	}

	@Override
	public void onStateStart() {
		// TODO ANNNOUNCE WINNERS etc.
		// SAVE STATS?

	}

	@Override
	public void onStateEnd() {
		GameManager.setCurrentState(GameStateType.RESET);
	}

	@Override
	public void onEverySecondForever() {
		// Never called.
	}

}
