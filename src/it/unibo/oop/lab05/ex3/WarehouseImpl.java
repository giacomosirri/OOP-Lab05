package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl {

	private final Set<Product> products;
	
	public WarehouseImpl(final Set<Product> products) {
		this.products = new LinkedHashSet<>(products);
	}
	
}
