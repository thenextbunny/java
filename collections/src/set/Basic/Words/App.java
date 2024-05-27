package set.Basic.Words;

public class App {
    public static void main(String[] args) {
        Words words = new Words();

        words.addWord("Car");
        words.addWord("Car");
        words.addWord("Airplane");
        words.addWord("Bus");
        words.addWord("Yellow");

        words.showWords();

        words.removeWord("Airplane");

        words.showWords();

        String word = "yellow";
        System.out.println(STR."Words has \{word}: \{words.verifyWord(word)}");
    }
}
