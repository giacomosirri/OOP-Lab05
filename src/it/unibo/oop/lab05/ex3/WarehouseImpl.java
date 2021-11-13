package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> products;

	/**
	 * 
	 * @param products
	 * 				the set of products that are in the warehouse initially.
	 */
	public WarehouseImpl(final Set<Product> products) {
		this.products = new LinkedHashSet<>(products);
	}

	/**
	 * Initializes an empty warehouse.
	 */
	public WarehouseImpl() {
		this.products = new LinkedHashSet<>();
	}

	public void addProduct(Product p) {
		this.products.add(p);
	}

	public Set<String> allNames() {
		final var names = new HashSet<String>();
		for (Product p : this.allProducts()) {
			names.add(p.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		return new LinkedHashSet<>(this.products);
	}

	public boolean containsProduct(Product p) {
		return this.allProducts().contains(p);
	}

	public double getQuantity(String name) {
		for (Product prod : this.allProducts()) {
			if (prod.getName().equals(name)) {
				return prod.getQuantity();
			} 	
		}
		return -1;
	}

	public String toString() {
		return this.products.toString();
	}
}
