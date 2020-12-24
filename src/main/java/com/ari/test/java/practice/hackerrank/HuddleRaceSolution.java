package com.ari.test.java.practice.hackerrank;

import java.util.stream.IntStream;

public class HuddleRaceSolution {
	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {
		int huddleSum = IntStream.of(height).filter(v -> v > k).max().orElse(k) - k;
		return huddleSum;
	}

	public static void main(String[] args) {
		int k = 7;
		String[] heightItems = "2 5 4 5 2".split(" ");
		int[] height = new int[heightItems.length];

		for (int i = 0; i < heightItems.length; i++) {
			int heightItem = Integer.parseInt(heightItems[i]);
			height[i] = heightItem;
		}

		int result = hurdleRace(k, height);
		System.out.println(result);
	}
}
