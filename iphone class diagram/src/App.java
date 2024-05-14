public class App {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        iPhone.openURL("https://dio.me");
        iPhone.refreshPage();
        iPhone.closeURL("https://dio.me");

        iPhone.answerCall(false);
        iPhone.call("551140404040");
        iPhone.startVoiceMail("5511404040", "Please, talk to me :C");

        iPhone.selectMusic("Butterflies", "Aurora");
        iPhone.playSong();
        iPhone.pauseSong();
    }
}
