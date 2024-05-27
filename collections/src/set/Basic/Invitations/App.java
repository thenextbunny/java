package set.Basic.Invitations;

public class App {
    public static void main(String[] args) {
        Invitations invitations = new Invitations();

        invitations.addInvitation("Pedro", 0);
        invitations.addInvitation("Lucas", 1);
        invitations.addInvitation("Maria", 3);
        invitations.addInvitation("Ana", 1);

        invitations.showInvitations();

        invitations.removeInvitationById(3);

        invitations.showInvitations();

        System.err.println(STR."\{invitations.countInvitations()} invitations! :D");
    }
}
