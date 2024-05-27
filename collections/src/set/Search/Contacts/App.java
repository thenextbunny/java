package set.Search.Contacts;

public class App {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.addContact("Pedro", "5050");
        contacts.addContact("Ana", "5050");
        contacts.addContact("Mauro", "4040");

        contacts.showContacts();

        System.out.println(contacts.searchByName("pedro"));

        System.out.println(contacts.updateContact("Pedro", null, null, "6060"));

        contacts.showContacts();
    }
}
