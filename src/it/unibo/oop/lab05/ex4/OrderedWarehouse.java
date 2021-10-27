package it.unibo.oop.lab05.ex4;

import java.util.*;
import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl implements OrderedWarehouseInterface{

	public OrderedWarehouse(Set<Product> products) {
		super(new TreeSet<Product>(products));
	}
	
	public OrderedWarehouse() {
	}
	
	public void addProduct(Product p) {
		final TreeSet<Product> products = new TreeSet<>(this.allProducts());
		products.add(p);
	}
	
	public Set<Product> allProducts() {
		final var products = super.allProducts();
		return products;
	}
}
