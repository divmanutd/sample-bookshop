package com.divyesh.bookshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class BookTest {

	@Test
	public void test() {
		List<Map<String, Integer>> cities = new ArrayList<>();

		Map<String, Integer> cityMap = Map.of("LA", 100, "New York", 200, "Mumbai", 300, "Stockholm", 400, "Zurich",
				500, "London", 600

		);
		cities.add(cityMap);
		String cityName = "London";

		Map<String, Integer> finalMap = cities.stream().reduce((firstMap, secondMap) -> {
			firstMap.putAll(secondMap);
			return firstMap;
		}).orElse(null);
		int totalPopulation = 0;
		String startWord = Character.toString(cityName.charAt(0));
		Set<String> keys = finalMap.keySet();
		List<String> names = keys.stream().filter(name -> name.startsWith(startWord)).collect(Collectors.toList());
		System.out.println("Cities " + names);
		for (String name : names) {
			totalPopulation += finalMap.get(name);
		}
		System.out.println("Total Population of cities starting with letter " + startWord + " is "+totalPopulation);

	}
}
