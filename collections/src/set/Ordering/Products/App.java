package set.Ordering.Products;

public class App {
    public static void main(String[] args) {
        Products products = new Products();

        products.addProduct(1L, "Smartphone", 1000d, 10);
        products.addProduct(2L, "Notebook", 1500d, 5);
        products.addProduct(1L, "Mouse", 30d, 20);
        products.addProduct(4L, "Keyboard", 50d, 15);
        products.addProduct(5L, "Phone", 30d, 20);


        products.showProducts();

        System.out.println(products.productsByName());

        System.out.println(products.productsByPrice());
    }
}
