package set.Basic.Invitations;

import java.util.HashSet;
import java.util.Set;

public class Invitations {
    private Set<Invitation> invitations;

    public Invitations() {
        this.invitations = new HashSet<>();
    }

    public void addInvitation(String name, int id) {
        invitations.add(new Invitation(name, id));
    }

    public void removeInvitationById(int id) {
        Invitation invitationToRemove = null;

        for (Invitation invitation : invitations) {
            if (invitation.getId() == id) {
                invitationToRemove = invitation;
                break;
            }
        }

        invitations.remove(invitationToRemove);
    }
    
    public int countInvitations() {
        return invitations.size();
    }

    public void showInvitations() {
        System.out.println(invitations);
    }
}
