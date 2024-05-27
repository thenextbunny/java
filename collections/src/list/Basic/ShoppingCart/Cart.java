package list.Basic.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();

        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        }

        items.removeAll(itemsToRemove);
    }

    public double calculateTotal() {
        double total = 0d;

        for (Item item : items) {
            double itemValueConsiderateQuantity = item.getPrice() * item.getQuantity();
            total += itemValueConsiderateQuantity;
        }
        
        return total;
    }

    public void showItems() {
        System.out.println(items);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
