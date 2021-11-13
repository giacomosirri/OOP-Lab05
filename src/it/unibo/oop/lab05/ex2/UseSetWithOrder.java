package it.unibo.oop.lab05.ex2;

import java.util.*;

/**
 * 
 * A simple use case for a {@link java.util.TreeSet} using a 
 * {@link it.unibo.oop.lab05.ex2.StringComparator} to insert the string with some order.
 */
public final class UseSetWithOrder {

	private UseSetWithOrder() {
	}

	/**
	 * @param args
	 *            ignored
	 */
	public static void main(final String[] args) {
		/*
		 * Write a program which:
		 * 
		 * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
		 * a new Comparator in a separate class.
		 */
		final var comp = new StringComparator(true);
		final Set<String> set = new TreeSet<String>(comp);
		set.add("10");
		set.add("92");
		set.add("7");
		set.add("11");
		set.add("50");
		System.out.println(set);

		/* 
		 * 2) Inserts in the set a hundred strings containing randomly generated
		 * numbers (use Math.random())
		 */ 
		for(int i = 0; i < 100; i++) {
			Double d = Math.floor(Math.random() * 1000);
			set.add(String.valueOf(d.intValue()));
		}

		/* 
		 * 3) Prints the set, which must be ordered
		 */
		System.out.println(set);
	}
}
