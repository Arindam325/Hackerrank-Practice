package com.ari.test.java.practice.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class BirdCountSolution {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		int res = 0;
		Map<Integer, Integer> birdCount = new HashMap<>();
		for (int i : arr) {
			Integer val = birdCount.get(i);
			if (val == null) {
				val = 0;
			}
			val++;
			birdCount.put(i, val);
		}
		System.out.println("birdCount ::" + birdCount);
		Map<Integer, Integer> sortedBirdCount = new TreeMap<>((k1, k2) -> {
			int r = birdCount.get(k2).compareTo(birdCount.get(k1));
			if (r == 0) {
				r = k1.compareTo(k2);
			}
			return r;
		});

		sortedBirdCount.putAll(birdCount);
		System.out.println("sortedBirdCount ::" + sortedBirdCount);
		res = (int) sortedBirdCount.keySet().toArray()[0];
		return res;
	}

	public static void main(String[] args) throws IOException {

		int arrCount = 4;

		List<Integer> arr = Stream.of("1 2 3 4 5 4 3 2 1 3 4".split(" ")).map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		System.out.println(result);
	}
}
