package com.ari.test.java.practice.hackerrank;

public class SherlockSquareSolution {
	// Complete the squares function below.
	static int squares(int a, int b) {
		int res = 0;

		double lVal = Math.ceil(Math.sqrt(a));
		while (true) {
			double lSqr = lVal * lVal;
			if (lSqr <= b) {
				res++;
				lVal++;
			} else {
				break;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		String[] arr = { "3 9", "17 24" };
		for (int qItr = 0; qItr < arr.length; qItr++) {
			String[] ab = arr[qItr].split(" ");

			int a = Integer.parseInt(ab[0]);

			int b = Integer.parseInt(ab[1]);

			int result = squares(a, b);

			System.out.println(result);
		}

	}
}
