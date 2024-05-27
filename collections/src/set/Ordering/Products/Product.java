package set.Ordering.Products;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private long id;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, long id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return STR."\{quantity} \{name} with id \{id} and price \{price}";
    }

    // This defines that product is unique by id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product product)) return false;
        return getId() == product.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // This code define how the code will compare by product name in Products showProductsByName
    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }
}

class ComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
    
}