package set.Search.Contacts;

import java.util.HashSet;
import java.util.Set;

public class Contacts {
    private Set<Contact> contacts;

    public Contacts() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number.trim()));
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();
        
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().startsWith(name) || contact.getName().equalsIgnoreCase(name)) {
                contactsByName.add(contact);
            }
        }

        return contactsByName;
    }

    public Contact updateContact(String name, String newName, String number, String newNumber) {
        Contact updateContact = null;

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name) || contact.getNumber().equals(number)) {
                if (newName != null) contact.setName(newName);
                if (newNumber != null) contact.setNumber(newNumber);

                updateContact = contact;
                break;
            }
        }

        return updateContact;
    }
}
