import java.io.*;
import java.nio.charset.StandardCharsets;
// import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class WordTranslator {
    // The name of the properties file that contains the words and their
    // translations
    private static final String FILE_NAME = "words.properties";

    // The source and target languages
    private static final String SOURCE_LANG = "English";
    private static final String TARGET_LANG = "Hindi";

    // The properties object that holds the words and their translations
    private static Properties words;

    // The scanner object that reads the input from the user
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        // Load the words and their translations from the file
        loadWords();

        // Create a scanner object to read the input from the user
        scanner = new Scanner(System.in);

        // Ask the user to enter a word in the source language
        System.out.println("Enter a word in " + SOURCE_LANG + ":");
        String word = scanner.nextLine();

        // Translate the word to the target language and display the result
        String translation = translate(word);
        System.out.println("The translation of " + word + " in " + TARGET_LANG + " is: " + translation);
    }

    // A method that loads the words and their translations from the file
    // A method that loads the words and their translations from the file
    // A method that loads the words and their translations from the file
    // A method that loads the words and their translations from the file
    private static void loadWords() {
        words = new Properties();

        try (Reader reader = new InputStreamReader(new FileInputStream(FILE_NAME), StandardCharsets.UTF_8)) {
            words.load(reader);
        } catch (IOException e) {
            System.out.println("Error: Could not load the file " + FILE_NAME);
            e.printStackTrace();
        }
    }

    // A method that translates a word from the source language to the target
    // language
    // A method that translates a word from the source language to the target
    // language
    // A method that translates a word from the source language to the target
    // language
    private static String translate(String word) {
        // Check if the word exists in the properties
        if (words.containsKey(word)) {
            // Return the translation
            return words.getProperty(word);
        } else {
            // Return a message indicating that the word is not available
            return "Sorry, the word " + word + " is not available in " + TARGET_LANG;
        }
    }

}
