import java.io.*;
import java.util.Properties;
import java.util.Scanner;
public class WordTranslator {
    public static void main(String[] args) {
        loadWords();
        scanner=new Scanner(System.in);
        Properties words = new Properties();
        System.out.print("Enter a word in " + SOURCE_LANG + ":");
        String word = scanner.nextLine();
        String translation = translate(word);
        System.out.println("The translation of " + word + " in " + TARGET_LANG + " is: " + translation);
    }
    //The name of the properties file that contains the words and their translations
    private static final String FILE_NAME = "config.properties";
    //The source and target languages
    private static final String SOURCE_LANG = "English";
    private static final String TARGET_LANG = "Spanish";

    //The properties object that holds the words and their translations
    private static Properties words;

    //The scanner object that reads the input from the user
    private static Scanner scanner;

    //method that loads the words and their translations from the file
    private static void loadWords() {
        words = new Properties();

        try (InputStream input = new FileInputStream(FILE_NAME)) {
            words.load(input);
//            System.out.println(words);
        } catch (IOException e) {
            System.out.println("Error: Could not load the file " + FILE_NAME);
            e.printStackTrace();
        }
    }
    //method that translates a word from the source language to the target language
    private static String translate(String word) {
        if (words != null && words.containsKey(word)) {
            return words.getProperty(word); //word (key) enter by user
        } else {
            return "Sorry, the word " + word + " is not available in " + TARGET_LANG;
        }
    }
}

