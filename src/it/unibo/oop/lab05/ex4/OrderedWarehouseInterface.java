package it.unibo.oop.lab05.ex4;

import java.util.Set;
import it.unibo.oop.lab05.ex3.Product;

/**
 * 
 * This interface models a warehouse in which the products are lexicographically ordered.
 */
public interface OrderedWarehouseInterface {
    /**
     * Returns the products in lexicographical order.
     * 
     * @return p
     *        the products lexicographically ordered.
     */
    Set<Product> allProducts();
}
