import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();

        System.out.println("Telegram");
        telegram.sendMessage();
        telegram.receiveMessage();

        System.out.println("WhatsApp");
        whatsApp.sendMessage();
        whatsApp.receiveMessage();

        System.out.println("Choosing a service... 1 is WhatsApp and 2 is Telegram");
        Messenger messenger = null;
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                messenger = new WhatsApp();
                break;
            case 2: 
                messenger = new Telegram();
            default:
                System.out.println("Service not found");
                break;
        }

        messenger.sendMessage();
        messenger.receiveMessage();

        scanner.close();

    }
}
