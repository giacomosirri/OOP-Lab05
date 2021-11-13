package it.unibo.oop.lab05.ex3;

/**
 * 
 * This interface represents a product.
 */
public interface Product {

    /**
     * @return the product name
     */
    String getName();

    /**
     * @return the amount of product
     */
    double getQuantity();

    /**
     * Two products are equals if they are the same or if they have the same name.
     * 
     * @param p
     * @return true if the products are equals.
     */
    boolean equals(Product p);
}
