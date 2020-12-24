package com.ari.test.java.practice.hackerrank;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonDivisibleSubsetSolution {
	/*
	 * Complete the 'nonDivisibleSubset' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * following parameters: 1. INTEGER k 2. INTEGER_ARRAY s
	 */

	public static int nonDivisibleSubset(int k, List<Integer> s) {

		int[] cnts = new int[k];
		for (int i = 0; i < k; ++i) {
			cnts[i] = 0;
		}
		for (int i = 0; i < s.size(); ++i) {
			cnts[s.get(i) % k] += 1;
		}
		int cnt = cnts[0] < 1 ? cnts[0] : 1;
		for (int i = 1; i < k / 2 + 1; ++i) {
			if (i != k - i) {
				cnt += cnts[i] > cnts[k - i] ? cnts[i] : cnts[k - i];
			}
		}
		if (k % 2 == 0) {
			cnt += 1;
		}
		System.out.println(cnt);
		return cnt;

	}

	public static void main(String[] args) throws IOException {

		String[] firstMultipleInput = "4 3".split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);
		List<Integer> s = Stream.of("1 7 2 4".split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		int result = nonDivisibleSubset(k, s);
		System.out.println(result);
	}
}
