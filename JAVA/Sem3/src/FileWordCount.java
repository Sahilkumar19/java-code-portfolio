//write a program to iterate through a directory and print all the files with paths and also only file names . afterwords shoe the numbers of words in each file
import java.io.*;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;

public class FileWordCount {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\kumar\\Desktop\\JAVA\\Arrays\\src";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        //Print full path
                        System.out.println("Full Path: " + file.getAbsolutePath());

                        //Print only file name
                        System.out.println("File Name: " + file.getName());

                        //Count words in the file
                        int wordCount = countWords(file);
                        System.out.println("Number of Words: " + wordCount);

                        System.out.println();  //Separating each file's information
                    }
                }
            } else {
                System.out.println("No files in the directory.");
            }
        } else {
            System.out.println("Invalid directory path or the directory does not exist.");
        }
    }
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
}

