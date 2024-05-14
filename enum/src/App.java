public class App {
    public static void main(String[] args) throws Exception {
        for (Countries e: Countries.values()) {
            System.out.println(STR."\{e.getName()} (\{e.getAbbreviation()})");
        }
    }
}
