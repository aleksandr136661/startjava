package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	public int[] saveNumberPl1 = new int [10];
	public int[] saveNumberPl2 = new int [10];

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
}

