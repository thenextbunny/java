package list.Basic.ShoppingCart;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem("Cheese", 15, 2);
        cart.addItem("Bread", 4, 1);

        cart.showItems();

        cart.removeItem("Bread");

        cart.showItems();

        System.out.println(cart.calculateTotal());
    }
}
