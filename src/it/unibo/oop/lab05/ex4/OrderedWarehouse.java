package it.unibo.oop.lab05.ex4;

import java.util.*;
import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse implements OrderedWarehouseInterface {

	private final WarehouseImpl unorderedWarehouse;
	private final Set<Product> products;
	
	public OrderedWarehouse(Set<Product> products) {
		this.unorderedWarehouse = new WarehouseImpl(products);
		this.products = new TreeSet<Product>(products);
	}
	
	public OrderedWarehouse() {
		this.unorderedWarehouse = new WarehouseImpl();
		this.products = new TreeSet<Product>();
	}

	public void addProduct(Product p) {
		this.products.add(p);
		this.unorderedWarehouse.addProduct(p);
	}
	
	public Set<Product> allProducts() {
		final var products = new TreeSet<>(this.products);
		return products;
	}
	
	public Set<String> allNames() {
		final var copyProducts = new TreeSet<>(this.products);
		final var names = new TreeSet<String>();
		final var iterator = copyProducts.iterator();
		while (iterator.hasNext()) {
			names.add(iterator.next().getName());
		}
		return names;
	}
	
	public WarehouseImpl getUnorderedWarehouse() {
		final var warehouse = this.unorderedWarehouse;
		return warehouse;
	}
}
