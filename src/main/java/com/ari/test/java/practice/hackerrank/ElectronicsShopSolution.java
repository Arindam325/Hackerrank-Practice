package com.ari.test.java.practice.hackerrank;

public class ElectronicsShopSolution {
	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int res = -1;

		for (int i = 0; i < keyboards.length; i++) {
			int temp = 0;
			for (int j = 0; j < drives.length; j++) {
				temp = keyboards[i] + drives[j];
				if (temp <= b && temp > res)
					res = temp;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		int b = 5;
		int[] keyboards = { 4 };
		int[] drives = { 5 };

		/*
		 * The maximum amount of money she can spend on a keyboard and USB
		 * drive, or -1 if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);
		System.out.println(moneySpent);
	}
}
