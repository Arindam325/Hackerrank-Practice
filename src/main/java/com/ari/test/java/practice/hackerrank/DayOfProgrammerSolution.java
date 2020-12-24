package com.ari.test.java.practice.hackerrank;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.JulianFields;
import java.util.GregorianCalendar;

public class DayOfProgrammerSolution {

	private static int DAY_TO_FIND = 256;

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		String res = "";

		LocalDate startDate = LocalDate.of(year, 1, 1).plusDays(DAY_TO_FIND - 1);
		// System.out.println(startDate.isLeapYear());

		if (year < 1918) {
			if (!startDate.isLeapYear() && year % 4 == 0) {
				startDate = startDate.minusDays(1);
			}
		} else if (year == 1918) {
			startDate = startDate.plusDays(13);
		}
		res = startDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		return res;
	}

	public static void main(String[] args) throws IOException {

		int year = 1918;

		String result = dayOfProgrammer(year);
		System.out.println(result);
	}
}
