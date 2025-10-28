package com.example;

/**
 * A utility class for counting letters in words.
 */
public class LetterCounter {

    /**
     * Counts the number of letters in a word.
     * Only alphabetic characters are counted (A-Z, a-z).
     *
     * @param word the word to count letters in
     * @return the number of letters in the word
     */
    public int countLetters(String word) {
        if (word == null) {
            return 0;
        }

        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method for testing the letter counter.
     */
    public static void main(String[] args) {
        LetterCounter counter = new LetterCounter();

        // Example usage
        String[] testWords = {"hello", "world", "Java123", "test-word", "abc"};

        System.out.println("Letter Counter Examples:");
        System.out.println("========================");
        for (String word : testWords) {
            int letterCount = counter.countLetters(word);
            System.out.println("Word: \"" + word + "\" -> Letters: " + letterCount);
        }
    }
}
