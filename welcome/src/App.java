public class App {
    public static void main(String[] args) {
        String firstName = "Pedro";
        String lastName = "Andrew";

        System.out.println(getFullName(firstName, lastName));
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName .concat(" ").concat(lastName);
    }
}
