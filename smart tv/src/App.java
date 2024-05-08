public class App {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.turnOn();
        smartTV.lowerVolume();

        String status = smartTV.on ? "ligada" : "desligada";

        System.out.println("A TV está " + status);
        System.out.println("Volume atual: " + smartTV.volume);
        System.out.println(smartTV.channel);
    }
}
