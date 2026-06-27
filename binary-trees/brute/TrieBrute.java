/*
 * ------------------------------------------------------------
 * Problem    : 208. Implement Trie (Prefix Tree)
 * File       : TrieBrute.java
 * Approach   : Brute Force (Store All Words)
 *
 * Description:
 * Store all inserted words inside an ArrayList.
 * Search and startsWith() scan every stored word.
 *
 * Time Complexity
 * Insert      : O(1)
 * Search      : O(n × L)
 * StartsWith  : O(n × L)
 * Space       : O(n × L)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
class TrieBrute {
    ArrayList<String> words;
    public TrieBrute() {
        words = new ArrayList<>();
    }
    public void insert(String word) {
        words.add(word);
    }
    public boolean search(String word) {
        for (String s : words) {
            if (s.equals(word))
                return true;
        }
        return false;
    }
    public boolean startsWith(String prefix) {
        for (String s : words) {
            if (s.startsWith(prefix))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        TrieBrute trie = new TrieBrute();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}