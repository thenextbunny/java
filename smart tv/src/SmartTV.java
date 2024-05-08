public class SmartTV {
    boolean on = false;
    int channel = 5;
    int volume = 25;

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void upVolume() {
        if (volume == 100) return;
    
        volume++;
    }
    public void lowerVolume() {
        if (volume == 0) return;

        volume--;
    }
    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}