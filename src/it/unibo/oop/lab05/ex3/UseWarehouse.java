package it.unibo.oop.lab05.ex3;

/**
 * Simple test class for {@link Warehouse}.
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

		final Product p1 = new ProductImpl("meat");
		final Product p2 = new ProductImpl("vegetables", 5);
		final Product p3 = new ProductImpl("pasta", 15.2);

		final Warehouse w = new WarehouseImpl();
		w.addProduct(p3);
		w.addProduct(p1);
		w.addProduct(p2);

		System.out.println("w " + w.allNames());
		System.out.println("w " + w.allProducts());

		// Changes to the returned set should not affect the warehouse
		final var modifiedProductSet = w.allProducts();
		modifiedProductSet.remove(p1);

		System.out.println("w " + w.allNames());
		System.out.println("w " + w.allProducts());
		System.out.println("Modified w " + modifiedProductSet);
	}
}
