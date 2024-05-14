import phone.InternetBrowser;
import phone.MusicPlayer;
import phone.TelephoneCall;

public class iPhone implements InternetBrowser, MusicPlayer, TelephoneCall {

    @Override
    public void call(String number) {
        System.out.println(STR."Calling to \{number}");
    }

    @Override
    public void answerCall(Boolean accept) {
        if (accept) System.out.println("Accepting call");
        else System.out.println("Declining call");
    }

    @Override
    public void startVoiceMail(String number, String message) {
        System.out.println(STR."Starting voice mail to \{number} with message '\{message}'");
    }

    @Override
    public void playSong() {
        System.out.println("Playing song");
    }

    @Override
    public void pauseSong() {
        System.out.println("Pausing song");
    }

    @Override
    public void selectMusic(String name, String artist) {
        System.out.println(STR."Selecting song \{name} by \{artist}");
    }

    @Override
    public void openURL(String url) {
        System.out.println(STR."Showing page with URL \{url}");
    }

    @Override
    public void closeURL(String url) {
        System.out.println(STR."Closing page with URL \{url}");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing actual page");
    }

}