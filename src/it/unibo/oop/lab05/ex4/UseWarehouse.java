package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;

/**
 *
 */
public final class UseWarehouse {

	private UseWarehouse() {
	}

	/**
	 * @param args
	 *            unused
	 */
	public static void main(final String[] args) {

		final Product p1 = new ComparableProduct("meat", 0.7);
		final Product p2 = new ComparableProduct("vegetables");
		final Product p3 = new ComparableProduct("pasta", 10.4);
		final Product p4 = new ComparableProduct("pasta", 0.9);

		final OrderedWarehouse w = new OrderedWarehouse();
		w.addProduct(p1);
		w.addProduct(p2);
		w.addProduct(p3);
		w.addProduct(p4);

		System.out.println(w.allNames());
		System.out.println(w.allProducts());

		// Changes to the returned set should not affect the warehouse
		final var modifiedProductSet = w.allProducts();
		modifiedProductSet.remove(p1);

		System.out.println(w.allNames());
		System.out.println(w.allProducts());
		System.out.println(modifiedProductSet);
	}
}
