package com.justbru00.epic.chickengame.game;

import java.util.ArrayList;

import com.justbru00.epic.chickengame.game.states.GameState;

public class GameManager {

	private static ArrayList<GameState> gameStates = new ArrayList<GameState>();
	private static int repeatingTaskId = -1;
	private static GameStateType currentState;
	
	private static int timer = -1;
	
	public static void init() {
		gameStates.clear();
		
		//TODO ADD STATES
		
		// TODO STOP REPEATING TASK IF RUNNING. START REPEATING TASK
		
		
		// TODO set current state to WAIT
	}
	
	/**
	 * Called every second by the repeating task.
	 */
	public static void onEverySecond() {
		// Wait FOREVER
		if (timer == -1) {
			getCurrentState().onEverySecondForever();
		} else if (timer == 0) {
			getCurrentState().onStateEnd();
		} else {
			timer--;
		}
	}
	
	public static void setCurrentState(GameStateType type) {
		for (GameState gs : gameStates) {
			if (gs.getGameStateType().equals(type)) {
				currentState = gs.getGameStateType();
				timer = gs.getTimeUntilNextState();
				gs.onStateStart();
			}
		}	
	}

	public static int getRepeatingTaskId() {
		return repeatingTaskId;
	}

	public static GameState getCurrentState() {
		for (GameState gs : gameStates) {
			if (gs.getGameStateType().equals(currentState)) {
				return gs;
			}
		}	
		
		return null;
	}
	
	public static void setTimerRemaining(int time) {
		timer = time;
	}
	
}
