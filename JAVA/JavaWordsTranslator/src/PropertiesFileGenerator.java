import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PropertiesFileGenerator {

    private static String generateRandomWord(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    private static void generatePropertiesFile(int entries) {
        try (FileWriter fileWriter = new FileWriter("translations.properties")) {
            fileWriter.write("# English to Spanish Translations\n\n");
            for (int i = 0; i < entries; i++) {
                String englishWord = generateRandomWord(5);
                String spanishWord = generateRandomWord(5);
                fileWriter.write(englishWord + "=" + spanishWord + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        generatePropertiesFile(10000);
    }
}

