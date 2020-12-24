package com.ari.test.java.practice.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationEquation {
	// Complete the permutationEquation function below.
	static int[] permutationEquation(int[] p) {

		int[] res = new int[p.length];
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		Arrays.toString(p);
		for (int i = 1; i <= p.length; i++) {
			int input = p[i-1];
			data.put(input, i);
		}

		for (int i = 1; i <= p.length; i++) {
			int key1 = data.get(i);
			int result = data.get(key1);
			res[i - 1] = result;
		}

		return res;
	}

	public static void main(String[] args) throws IOException {

		String[] pItems = "4 3 5 1 2".split(" ");
		int[] p = new int[pItems.length];

		for (int i = 0; i < pItems.length; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}

		int[] result = permutationEquation(p);

		Arrays.toString(result);
	}
}
