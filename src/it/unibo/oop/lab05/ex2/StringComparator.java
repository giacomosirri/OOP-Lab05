package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

/**
 * 
 * Implement a comparison format to compare the numerical (integer) content of two strings
 */
public class StringComparator implements Comparator<String> {

	private boolean ascendingOrdering;
	
	/**
	 * @param order
	 * 			true if the order is ascending.
	 */
	public StringComparator(boolean order) {
		this.ascendingOrdering = order;
	}

	/**
	 * Sets the default ordering, which is the ascending order.
	 */
	public StringComparator() {
		this.ascendingOrdering = true;   // the default ordering is the ascending ordering
	}
	
	/**
	 * Declares how to strings must be compared when they contain integers
	 * {@inheritDoc}
	 */
	public int compare(String a1, String a2) {
		final int int1 = Integer.parseInt(a1);
		final int int2 = Integer.parseInt(a2);
		return this.ascendingOrdering == true ? int1 - int2 : int2 - int1;
	}
	
	/**
	 * Sets the ordering method.
	 * 
	 * @param order
	 * 			true if the required order is ascending, false otherwise.
	 */
	public void setOrdering(boolean order) {
		this.ascendingOrdering = order;
	}

}
