package com.ari.test.java.practice.hackerrank;

public class JumpingCloudsSolution {
	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int res = -1;
		int n = c.length;
		for (int i = 0; i < n; i++, res++) {
			if (i < n - 2 && c[i + 2] == 0)
				i++;
		}

		return res;
	}

	public static void main(String[] args) {

		String[] cItems = "0 0 0 0 1 0".split(" ");
		int[] c = new int[cItems.length];

		for (int i = 0; i < cItems.length; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);
		System.out.println(result);
	}
}
