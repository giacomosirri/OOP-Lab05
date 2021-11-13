package it.unibo.oop.lab05.ex4;

import java.util.*;
import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse implements OrderedWarehouseInterface {

	private final Set<Product> products;
	private final Warehouse unorderedWarehouse;

	/**
	 * Initializes the ordered warehouse to contain the specified products.
	 * 
	 * @param products
	 * 				the set of that are in the ordered warehouse initially.
	 */
	public OrderedWarehouse(Set<Product> products) {
		this.products = new TreeSet<Product>(products);
		this.unorderedWarehouse = new WarehouseImpl(products);
	}

	/**
	 * Initializes an empty ordered warehouse.
	 */
	public OrderedWarehouse() {
		this(new HashSet<Product>());
	}

	private Warehouse getUnorderedWarehouse() {
		return this.unorderedWarehouse;
	}

	/**
	 * Adds the product to the ordered warehouse (if not already there) 
	 * in lexicographical order.
	 * 
	 * @param p
	 * 		 the product to be added.
	 */
	public void addProduct(Product p) {
		this.products.add(p);
		this.getUnorderedWarehouse().addProduct(p);
	}

	public Set<Product> allProducts() {
		return new TreeSet<>(this.products);   // defensive copy
	}

	/**
	 * Reuses the method defined in {@link it.unibo.oop.lab05.ex3.Warehouse}.
	 * 
	 * @return the names of the products stored in the warehouse (not ordered).
	 */
	public Set<String> allNames() {
		return this.getUnorderedWarehouse().allNames();
	}
}
