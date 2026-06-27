/*
 * ------------------------------------------------------------
 * Problem    : 208. Implement Trie (Prefix Tree)
 * File       : TrieOptimal.java
 * Approach   : Trie (Prefix Tree)
 *
 * Description:
 * Each node stores links to the next characters.
 * Insert, search, and startsWith traverse the Trie
 * one character at a time.
 *
 * Time Complexity
 * Insert      : O(L)
 * Search      : O(L)
 * StartsWith  : O(L)
 *
 * Space Complexity : O(n × L)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class TrieOptimal {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    TrieNode root;
    public TrieOptimal() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEnd = true;
    }
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return current.isEnd;
    }
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        TrieOptimal trie = new TrieOptimal();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}