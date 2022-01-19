package com.qa.gold;

public class Goldilocks {

	private int weight;

	private int maxTemp;

	public Goldilocks(int[] data) {
		super();
		this.weight = data[0];
		this.maxTemp = data[1];
	}

	public int getWeight() {
		return this.weight;
	}

	public int getMaxTemp() {
		return this.maxTemp;
	}

	public boolean checkPlace(Place p) {
		return this.weight < p.getMaxWeight() && this.maxTemp > p.getTemp();
	}

}
