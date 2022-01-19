package com.qa.gold;

public class Place {

	private int maxWeight;

	private int temp;

	public Place(int[] data) {
		super();
		this.maxWeight = data[0];
		this.temp = data[1];
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}

	public int getTemp() {
		return this.temp;
	}

}
