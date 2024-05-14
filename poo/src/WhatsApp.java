public class WhatsApp extends Messenger {
    @Override
    public void sendMessage() {
        checkConnection();
		System.out.println("WhatsApp sending message");
        saveMessageHistory();
	}
	
}