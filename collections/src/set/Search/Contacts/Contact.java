package set.Search.Contacts;

import java.util.Objects;

public class Contact {
    private String name;
    private String number;

    public Contact (String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return STR."\{name} with number \{number}";
    }

    // The contact is unique by phone number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact contact)) return false;
        return getNumber() == contact.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}
