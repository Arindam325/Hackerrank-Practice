package com.ari.test.java.practice.hackerrank;

public class CatsMouseSolution {
	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {

		String res = "";
		int xToz = z - x;
		int yToz = z - y;
		if (xToz == yToz)
			res = "Mouse C";
		else if (xToz < yToz)
			res = "Cat A";
		else if (xToz > yToz)
			res = "Cat B";

		return res;
	}

	public static void main(String[] args) {
		int q = 2;
		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = "1 2 3".split(" ");
			int x = Integer.parseInt(xyz[0]);
			int y = Integer.parseInt(xyz[1]);
			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);
			System.out.println(result);
		}

	}
}
