package com.ari.test.java.practice.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;

public class CutStickSolution {
	static int[] cutTheSticks(int[] arr) {
		int[] res = {};
		LinkedList<Integer> l = new LinkedList<>();
		int[] temp = arr;
		while (true) {
			if (temp.length > 0)
				l.add(temp.length);
			else
				break;
			int min = Arrays.stream(temp).min().getAsInt();
			temp = Arrays.stream(temp).map(v -> v - min).filter(v -> v > 0).toArray();
		}
		res = l.stream().mapToInt(i -> i).toArray();
		return res;
	}

	public static void main(String[] args) {

		String[] arrItems = "5 4 4 2 2 8".split(" ");
		int[] arr = new int[arrItems.length];

		for (int i = 0; i < arrItems.length; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] result = cutTheSticks(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.println("\n");
			}
		}

	}
}
