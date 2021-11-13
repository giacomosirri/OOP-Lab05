package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * 
 * Example class using {@link Set}.
 */
public final class UseSet {

	private UseSet() {
	}

	/**
	 * @param args
	 *            ignored
	 */
	public static void main(final String[] args) {
		/*
		 * Considering the content of "UseCollection", write a program which, in
		 * order:
		 */

		/*
		 * 1) Builds a TreeSet containing Strings
		 */
		final Set<String> set = new TreeSet<>();

		/* 
		 * 2) Populates such Collection with all the Strings ranging from "1" to
		 * "20"
		 */
		for (int i = 1; i <= 20; i++) {
			set.add(Integer.toString(i));
		}

		/* 
		 * 3) Prints its content
		 */
		System.out.println(set); 

		/* 
		 * 4) Removes all those strings whose represented number is divisible by
		 * three
		 */
		final var iterator = set.iterator();
		while (iterator.hasNext()) {
			if (Integer.parseInt(iterator.next()) % 3 == 0) {
				iterator.remove();
			}
		}

		/* 
		 * 5) Prints the content of the Set using a for-each construct
		 */ 
		System.out.print("[ ");
		for (final var s : set) {
			System.out.print(s + " ");
		}
		System.out.println("]");

		/* 
		 * 6) Verifies if all the numbers left in the set are even
		 */
		final var iterator2 = set.iterator();
		int i = 0;
		while (iterator2.hasNext() && Integer.parseInt(iterator2.next()) % 2 == 0) {
			i++;
		}
		System.out.println(i == set.size() ? "set only has even elements" : "set has odd elements too");	
	}
}
