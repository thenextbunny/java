import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        final String AGENCY = "067-8";
        String name;
        double balance;
        int account = rand.nextInt(10000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        name = scanner.nextLine();
        System.out.println("Quanto você deseja depositar?");
        balance = Double.parseDouble(scanner.nextLine());

        scanner.close();

        String message = STR."Olá \{name}, obrigado por criar uma conta em nosso banco, sua agência é \{AGENCY}, conta \{account} e seu saldo \{balance} já está disponível para saque.";

        System.out.println(message);
    }
}
