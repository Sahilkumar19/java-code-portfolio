//required classes that are used to implement the whole program
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {

    public static void main(String[] args) {
        //Check if the correct number of command-line arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileAnalyzer <directory_path>");
            System.exit(1);
        }

        //Get the directory path from the command-line arguments
        String directoryPath = args[0];
        File directory = new File(directoryPath);

        //Check if the specified path is a directory
        if (!directory.isDirectory()) {
            System.out.println("Error: not a directory");
            System.exit(1);
        }

        //Analyze files in the directory
        analyzeFiles(directory);
    }

    //Method to analyze files in the given directory
    private static void analyzeFiles(File directory) {
        //Get the list of files in the directory
        File[] files = directory.listFiles();

        //Check if the directory is not empty
        if (files != null) {
            // Print the total number of files in the directory
            System.out.println("1) Total number of files: " + files.length);

            //Iterate through each file in the directory
            for (File file : files) {
                // Print the content of each file
                System.out.println("\n2) Content of file: " + file.getName());
                printFileContent(file);

                //Print the total number of words in each file
                System.out.println("\n3) Total number of words in file: " + countWords(file));

                //Print the word frequency in each file
                System.out.println("\n4) Word frequency in file:");
                printWordFrequency(file);

                //Print the content of each file after removing stopwords
                System.out.println("\n5) Content of file after removing stopwords:");
                printFileWithoutStopwords(file);
            }
        }
    }

    //Method to read and print the content of a file line by line
    private static void printFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to count the number of words in a file
    private static int countWords(File file) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    private static void printWordFrequency(File file) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Print the word frequency
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //Method to print the content of a file after removing stopwords
    private static void printFileWithoutStopwords(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Print the word only if it is not a stopword
                    if (!isStopword(word)) {
                        System.out.print(word + " ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to check whether a word is a stopword
    private static boolean isStopword(String word) {
        // Array of stopwords
        String[] stopwords = {
                "a", "an", "and", "are", "as", "at", "be", "by", "for", "from",
                "has", "have", "he", "in", "is", "it", "its", "of", "on", "that",
                "the", "to", "was", "were", "with","while"
        };
        //Check if the word is a stopword
        for (String stopword : stopwords) {
            if (word.equalsIgnoreCase(stopword)) {
                return true;
            }
        }
        return false;
    }
}