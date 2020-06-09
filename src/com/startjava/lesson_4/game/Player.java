package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int[] enteredNums = new int[10];
	private int attempt = 0;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getEnteredNums() {
		return enteredNums;
	}

	public void setEnteredNum(int enteredNum) {
		enteredNums[attempt] = enteredNum;
		attempt++;
	}
	public int getAttemptCount() {
		return attempt;
	}
}