package com.ari.test.java.practice.hackerrank;

public class AppendDeleteSolution {

	// Complete the appendAndDelete function below.
	static String appendAndDelete(String s, String t, int k) {
		String res = "Yes";
		int commonLength = 0;

		for (int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) == t.charAt(i))
				commonLength++;
			else
				break;
		}
		if ((s.length() + t.length() - 2 * commonLength) > k) {
			res = "No";
		} else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
			res = "Yes";
		} else if ((s.length() + t.length() - k) < 0) {
			res = "Yes";
		} else {
			res = "No";
		}

		return res;
	}

	public static void main(String[] args) {
		String s = "y";
		String t = "yu";
		int k = 2;

		String result = appendAndDelete(s, t, k);
		System.out.println(result);
	}

}
