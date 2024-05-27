package set.Basic.Words;

import java.util.HashSet;
import java.util.Set;

public class Words {
    private Set<String> words;

    public Words() {
        this.words = new HashSet<>();
    }

    public void addWord(String word) {
        words.add(word);
    }
    
    public void removeWord(String word) {
        words.remove(word);
    }
    
    public boolean verifyWord(String word) {
        for (String string : words) {
            if (string.equalsIgnoreCase(word)) {
               return true;
            }
        }

        return false;
    }

    public void showWords() {
        System.out.println(STR."\{words} with size \{words.size()}");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
