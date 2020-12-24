package com.ari.test.java.practice.hackerrank;

public class LibraryFineSolution {
	// Complete the libraryFine function below.
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int res = 0;
		if (y1 > y2)
			res = 10000;
		else if (y1 == y2) {
			if (m1 > m2)
				res = 500 * (m1 - m2);
			else if (m1 == m2) {
				if (d1 > d2)
					res = 15 * (d1 - d2);
				else
					res = 0;
			} else
				res = 0;
		} else {
			res = 0;
		}

		return res;
	}

	public static void main(String[] args) {

		String[] d1M1Y1 = "9 6 2015".split(" ");
		int d1 = Integer.parseInt(d1M1Y1[0]);
		int m1 = Integer.parseInt(d1M1Y1[1]);
		int y1 = Integer.parseInt(d1M1Y1[2]);

		String[] d2M2Y2 = "6 6 2015".split(" ");
		int d2 = Integer.parseInt(d2M2Y2[0]);
		int m2 = Integer.parseInt(d2M2Y2[1]);
		int y2 = Integer.parseInt(d2M2Y2[2]);

		int result = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
	}
}
