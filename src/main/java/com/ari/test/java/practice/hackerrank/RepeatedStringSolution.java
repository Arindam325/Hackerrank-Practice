package com.ari.test.java.practice.hackerrank;

public class RepeatedStringSolution {
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int strLength = s.length();
		long aOccurrence = 0;
		long factor = n / strLength;
		long remainder = n % strLength;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a') {
				aOccurrence += (i < remainder) ? factor + 1 : factor;
			}
		}
		return aOccurrence;
	}

	public static void main(String[] args) {

		String s = "a";
		long n = 1000000000000l;

		long result = repeatedString(s, n);
		System.out.println(result);
	}
}
