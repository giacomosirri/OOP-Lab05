package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	private boolean ascendingOrdering;
	
	public StringComparator(boolean order) {
		this.ascendingOrdering = order;
	}

	public StringComparator() {
		this.ascendingOrdering = true;   // the default ordering is the ascending ordering
	}
	
	public int compare(String a1, String a2) {
		final int int1 = Integer.parseInt(a1);
		final int int2 = Integer.parseInt(a2);
		return this.ascendingOrdering == true ? int1 - int2 : int2 - int1;
	}
	
	public void setOrdering(boolean order) {
		this.ascendingOrdering = order;
	}

}
