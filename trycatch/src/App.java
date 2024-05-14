import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("What's your name?");
            String name = scanner.nextLine();
    
            System.out.println("What's your nickname?");
            String nickname = scanner.nextLine();
    
            System.out.println("What's your age?");
            int age = scanner.nextInt();

            System.out.println(STR."\{name} @\{nickname} has \{age} years old.");
        } catch (InputMismatchException e) {
            System.err.println("Input age must be a number.");
        }

        scanner.close();
    }
}
