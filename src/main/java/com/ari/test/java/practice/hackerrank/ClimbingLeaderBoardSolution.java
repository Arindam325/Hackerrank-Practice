package com.ari.test.java.practice.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClimbingLeaderBoardSolution {
	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] array = IntStream.of(scores).distinct().toArray();
		int i = array.length - 1;
		int[] res = new int[alice.length];
		int c = 0;
		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					res[c] = i + 2;
					c++;
					break;
				}
			}
			if (i < 0) {
				res[c] = 1;
				c++;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		String[] scoresItems = "100 100 50 40 40 20 10".split(" ");
		int[] scores = new int[scoresItems.length];
		for (int i = 0; i < scoresItems.length; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		String[] aliceItems = "5 25 50 120".split(" ");
		int[] alice = new int[aliceItems.length];

		for (int i = 0; i < aliceItems.length; i++) {
			int aliceItem = Integer.parseInt(aliceItems[i]);
			alice[i] = aliceItem;
		}

		int[] result = climbingLeaderboard(scores, alice);
		System.out.println(Arrays.toString(result));
	}
}
