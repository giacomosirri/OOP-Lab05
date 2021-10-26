package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity = 0;    // no products if not specified
	
	public ProductImpl (final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public ProductImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public double getQuantity() {
		return this.quantity;
	}
	
	private boolean equals(Product p) {
		return this.getName() == p.getName();
	}
	
	public String toString() {
		return this.name + ": " + this.quantity;
	}
	
}
