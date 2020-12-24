package com.ari.test.java.practice.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WordSearchSolution {

	public static void main(String[] args) {
		Set<String> dict = new HashSet();
		// TO-DO: Dictionary - Use file/console input if given 
		dict.addAll(Arrays.asList("ant", "dogo", "do", "go", "god", "dog"));
		// TO-DO: Master word
		String masterW = "dog";
		WordSearchSolution sol = new WordSearchSolution();
		Set<String> combinations = sol.getCombinations(masterW);
		System.out.println("master words combo :: " + combinations);
		Set<String> result = sol.getValidWords(dict, combinations);
		System.out.println("result :: " + result);
	}

	public Set<String> getValidWords(Set<String> dict, Set<String> combinations) {
		Set<String> res = new HashSet();
		res = dict.stream().filter(word -> combinations.contains(word)).collect(Collectors.toSet());
		return res;
	}

	public Set<String> getCombinations(String masterW) {
		StringBuilder temp = new StringBuilder(masterW);
		Set<String> m = new HashSet<>();
		for (int i = 0; i < temp.length(); i++) {
			for (int j = i + 1; j <= temp.length(); j++) {
				m.add((String) temp.subSequence(i, j));
				if (temp.subSequence(i, j).length() > 1) {
					m.add(new StringBuilder(temp.subSequence(i, j).toString()).reverse().toString());
				}
			}
		}
		return m;
	}
}
