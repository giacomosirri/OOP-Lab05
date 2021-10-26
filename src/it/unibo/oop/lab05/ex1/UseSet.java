package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
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
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each construct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final Set<String> set = new TreeSet<>();
    	for (int i = 1; i <= 20; i++) {
        	set.add(Integer.toString(i));
    	}
    	System.out.println(set);
    	
    	Iterator<String> iterator = set.iterator();
    	while (iterator.hasNext()) {
    		if (Integer.parseInt(iterator.next()) % 3 == 0) {
    			iterator.remove();
    		}
    	}
    	
    	for (String s : set) {
    		System.out.println(s);
    	}
    	
    	iterator = set.iterator();
    	int i = 0;
    	while (iterator.hasNext() && Integer.parseInt(iterator.next()) % 2 != 0) {
    		i++;
    	}
    	System.out.println(i == set.size() ? "set has only even elements" : "set has odd elements too");
    	
    }
}
