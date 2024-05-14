package phone;
public interface TelephoneCall {
    public void call(String number);
    public void answerCall(Boolean accept);
    public void startVoiceMail(String number, String message);
}
