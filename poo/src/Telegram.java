public class Telegram extends Messenger {
    @Override
    public void sendMessage() {
        checkConnection();
        System.out.println("Telegram sending message.");
        saveMessageHistory();
    }
}
