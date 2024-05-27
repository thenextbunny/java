package set.Basic.Invitations;

import java.util.Objects;

public class Invitation {
    private String name;
    private int id;

    public Invitation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return STR."\{name} - \{id}";
    }

    // This defines that invitation is unique by invitation code
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Invitation invitation)) return false;
        return getId() == invitation.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
