package com.qa.gold;

import java.util.ArrayList;
import java.util.List;

public class BearNecessities {

//	"100 80"
	public List<Integer> findPlaces(List<String> input) {

		List<Integer> validPlaces = new ArrayList<>();
		Goldilocks gold = null;

		for (int i = 0; i < input.size(); i++) {
			int[] data = getData(input.get(i));
			if (i == 0) {
				gold = new Goldilocks(data);
				continue;
			}
			Place place = new Place(data);
			if (gold.checkPlace(place)) {
				validPlaces.add(i);
			}
		}
		return validPlaces;
	}

	private int[] getData(String s) {
		String[] split = s.split(" ");
		return new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]) };
	}

}
