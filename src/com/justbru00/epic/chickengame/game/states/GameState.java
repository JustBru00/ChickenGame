package com.justbru00.epic.chickengame.game.states;

import com.justbru00.epic.chickengame.game.GameStateType;

public abstract class GameState {

	private GameStateType gameStateType;
	private int timeUntilNextState;
	
	/**
	 * 
	 * @param type
	 * @param timeUntilNextState Use -1 to wait forever until the state is changed with GameManager#setState()
	 */
	public GameState(GameStateType type, int _timeUntilNextState) {
		timeUntilNextState = _timeUntilNextState;
		gameStateType = type;
	}
	
	public abstract void onStateStart();
	
	public abstract void onStateEnd();
	
	/**
	 * Called every second when the timeUntilNextState is -1
	 */
	public abstract void onEverySecondForever();

	public GameStateType getGameStateType() {
		return gameStateType;
	}

	public int getTimeUntilNextState() {
		return timeUntilNextState;
	}
	
}
