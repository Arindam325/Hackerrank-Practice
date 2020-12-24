package com.ari.test.java.practice.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbersSolution {

	public static int pickingNumbers(List<Integer> a) {
		int res = 0, si = 0, ei = 0;
		Collections.sort(a);
		System.out.println(a);
		int t = 0, tVal, cVal = 0;
		tVal = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			cVal = a.get(i);
			if (cVal - tVal < 2) {
				ei = i;
				t = ei - si;
			} else {
				si = ei = i;
				tVal = a.get(i);
			}
			if (t > res)
				res = t;
		}
		// res = ei - si;
		return res+1;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
		int result = pickingNumbers(a);
		System.out.println(result);
	}
}
