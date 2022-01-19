package com.qa.gold;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestBear {

	private BearNecessities bear = new BearNecessities();

	@Test
	public void test123() {
		List<Integer> expectedPlaces = List.of(1, 2, 3);
		List<Integer> actualPlaces = this.bear
				.findPlaces(List.of("100 80", "110 70", "120 60", "130 50", "90 40", "140 90"));
		assertEquals(expectedPlaces, actualPlaces);
	}

	@Test
	public void test234() {
		List<Integer> expectedPlaces = List.of(2, 3, 4);
		List<Integer> actualPlaces = this.bear
				.findPlaces(List.of("100 80", "70 70", "120 60", "130 50", "110 40", "140 90"));
		assertEquals(expectedPlaces, actualPlaces);
	}
}
