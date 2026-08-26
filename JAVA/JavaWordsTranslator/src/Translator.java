import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Translator {
    private Properties translations;

    public Translator(String propertiesFilePath) {
        translations = new Properties();
        loadTranslations(propertiesFilePath);
    }

    private void loadTranslations(String propertiesFilePath) {
        try (FileInputStream fileInputStream = new FileInputStream(propertiesFilePath)) {
            translations.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String translate(String englishWord) {
        return translations.getProperty(englishWord, "Translation Not Found");
    }

    public static void main(String[] args) {
        Translator worldTranslator = new Translator("translations.properties");

        // Example translations
        System.out.println("Translate 'hello': " + worldTranslator.translate("hello"));
        System.out.println("Translate 'world': " + worldTranslator.translate("world"));
        System.out.println("Translate 'apple': " + worldTranslator.translate("apple"));
    }
}

