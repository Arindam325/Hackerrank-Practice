package com.ari.test.java.practice.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationEquationSolution {
	// Complete the permutationEquation function below.
	static int[] permutationEquation(int[] p) {
		int[] res = new int[p.length];
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		Arrays.toString(p);
		for (int i = 0; i < p.length; i++) {
			int input = p[i];
			data.put(input, i);
		}

		for (int i = 0; i < p.length; i++) {
			int key1 = data.get(i);
			int result = data.get(key1);
			res[i] = result;
		}

		return res;

	}

	public static void main(String args[]) throws Exception {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		String[] pItems = "2 3 1".split(" ");
		int[] p = new int[pItems.length];

		for (int i = 0; i < pItems.length; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}
		System.out.println(p.length + " " + p[0]);
		Arrays.toString(p);
		int[] result = permutationEquation(p);
		Arrays.toString(result);

	}
}
