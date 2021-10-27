package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> products;
	
	public WarehouseImpl(final Set<Product> products) {
		this.products = new LinkedHashSet<>(products);
	}
	
	public WarehouseImpl() {
		this.products = new LinkedHashSet<>();
	}
	
	public void addProduct(Product p) {
		this.products.add(p);
	}
	
	public Set<String> allNames() {
		final var copyProducts = new LinkedHashSet<>(this.products);
		final var names = new HashSet<String>();
		for (Product p : copyProducts) {
			names.add(p.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		final var copyProducts = new LinkedHashSet<>(this.products);
		return copyProducts;
	}

	public boolean containsProduct(Product p) {
		for (Product prod : this.products) {
			if (prod.equals(p)) {
				return true;
			} 	
		}
		return false;
	}

	public double getQuantity(String name) {
		for (Product prod : this.products) {
			if (prod.getName() == name) {
				return prod.getQuantity();
			} 	
		}
		return -1;
	}
	
	public String toString() {
		return this.products.toString();
	}

}
