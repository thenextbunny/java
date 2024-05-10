import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = scanner.nextInt();
            
        System.out.println("Enter the second number:");
        int second = scanner.nextInt();

        try {
            counter(first, second);
        } catch (Exception e) {
            System.out.println("The second parameter can be greater than the first.");
        }

        scanner.close();
    }

    static void counter(int first, int second) throws InvalidParametersException {
        if (first > second) throw new InvalidParametersException();

        int value;
        int counter = second - first;

        System.out.println("The counter...");

        for (int i = 0; i <= counter; i++) {
            value = counter + i;
            System.out.println(value);
        }
    }
}
