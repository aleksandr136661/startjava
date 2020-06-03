package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNums = new int[10];
	private int i = 0;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int[] getEnteredNums() {
		return enteredNums;
	}

	public void setEnteredNums(int enteredNum) {
			this.enteredNums[i] = enteredNum;
			i++;
	}
}