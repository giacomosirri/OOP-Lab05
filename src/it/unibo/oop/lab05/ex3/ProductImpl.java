package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;    

	/**
	 * Initializes a product with a name and a quantity.
	 * 
	 * @param name
	 * @param quantity
	 */
	public ProductImpl (final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	/**
	 * Initializes a product only with its name but no quantity.
	 * 
	 * @param name
	 */
	public ProductImpl(String name) {
		this(name, 0);	// no products if not specified
	}

	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public boolean equals(Product p) {
		return this == p || this.getName().equals(p.getName());
	}

	public String toString() {
		return this.name + ": " + this.quantity;
	} 
}
