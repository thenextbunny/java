import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade: ");

        int grade = scanner.nextInt();

        scanner.close();

        if (grade >= 6) {
            System.out.println("Pass!");
        } else {
            System.out.println("Not pass!");
        }
    }
}
