package set.Ordering.Products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Products {
    private Set<Product> products;

    public Products() {
        this.products = new HashSet<>();
    }

    public void addProduct(long id, String name, double price, int quantity) {
        products.add(new Product(name, id, price, quantity));
    }
    
    public Set<Product> productsByName() {
        Set<Product> productsByName = new TreeSet<>(products);

        return productsByName;
    }

    public Set<Product> productsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());

        productsByPrice.addAll(products);

        return productsByPrice;
    }

    public void showProducts() {
        System.out.println(products);
    }
}
