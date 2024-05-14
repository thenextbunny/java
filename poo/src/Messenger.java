public abstract class Messenger {
    public abstract void sendMessage();

    public void receiveMessage() {
        System.out.println("Receiving messages.");
    }
    // Encapsulation 
    protected void checkConnection() {
        System.out.println("Checking connection.");
    }
    protected void saveMessageHistory() {
        System.out.println("Saving message history");
    }

}
