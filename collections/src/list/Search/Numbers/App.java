package list.Search.Numbers;

public class App {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        int[] list = {10, 20, 5, 4, 5, 12, 2, 1, -5};
        
        for (int number : list) {
            numbers.addNumber(number);
        }

        System.out.println("Current numbers: " + numbers.showNumbers());

        System.out.println("Ascending: " + numbers.sortAscending());

        System.out.println("Descending: " + numbers.sortDescending());

        System.out.println("Total: " + numbers.calculateTotal());

        System.out.println("Largest number: " + numbers.findLargest());

        System.out.println("Smallest number: " + numbers.findSmallest());
    }
}
