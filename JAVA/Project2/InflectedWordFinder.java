/**
 * InflectedWordFinder:
 * This program provides a graphical user interface (GUI) to find inflected words
 * and their root forms based on specified stemming rules which are separately written inside
 * the several methods in stemmer_words class
 *
 * Author:Sahil kumar
 * Date:5 february 2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class InflectedWordFinder extends JFrame implements ActionListener {

    private JTextArea inputTextArea, outputTextArea;
    private JButton findButton;
    private WordStemmer wordStemmer;

    public InflectedWordFinder() {
        super("Inflected Word Finder");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        JLabel label1 = new JLabel("Enter your text:");
        inputPanel.add(label1);

        // Set line wrap to true for the inputTextArea
        inputTextArea = new JTextArea(10, 30);
        inputTextArea.setLineWrap(true);
        inputPanel.add(new JScrollPane(inputTextArea));
        add(inputPanel);

        JPanel buttonPanel = new JPanel();
        findButton = new JButton("Find Inflected Words");
        findButton.addActionListener(this);
        buttonPanel.add(findButton);
        add(Box.createVerticalGlue());  // Add space between button and boxes
        add(buttonPanel);
        add(Box.createVerticalGlue());  // Add space between button and boxes

        JPanel outputPanel = new JPanel();
        JLabel label2 = new JLabel("Stemmed text:");
        outputPanel.add(label2);
        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);
        outputPanel.add(new JScrollPane(outputTextArea));
        add(outputPanel);

        wordStemmer = new WordStemmer();

        // Set preferred size for the JTextAreas
        inputTextArea.setPreferredSize(new Dimension(300, 200));
        outputTextArea.setPreferredSize(new Dimension(300, 200));

        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findButton) {
            String text = inputTextArea.getText();
            String[] words = text.split("\\s+");
            StringBuilder output = new StringBuilder();

            for (String word : words) {
                String root = wordStemmer.stemWord(word);
                if (!word.equals(root)) {
                    output.append(word).append(" --> ").append(root).append("\n");
                }
            }

            outputTextArea.setText(output.toString());
        }
    }

    public static void main(String[] args) {
        new InflectedWordFinder();
    }
}


class WordStemmer {

    private static final Set<String> commonSuffixes = Set.of(
            "ing", "ed", "s","ly", "ful", "est", "ity", "ered", "ness", "er", "ic",
             "ive", "ize", "ment", "al", "tion"
    );//here we can add more suffixes in the set in order to get better accuracy in the output



    public String stemWord(String word) {
        for (String suffix : commonSuffixes) {
            if (word.length() >= suffix.length() && word.endsWith(suffix)) {
                return applyStemmingRule(word, suffix);
            }
        }
        return word;
    }

    private String applyStemmingRule(String word, String suffix) {
        switch (suffix) {
            case "ing":
                return stemIng(word);
            case "ed":
                return stemEd(word);
            case "ly":
                return stemLy(word);
            case "ful":
                return stemFul(word);
            case "est":
                return stemEst(word);
            case "ity":
                return stemIty(word);
            case "ness":
                return stemNess(word);
            case "er":
                return stemEr(word);
            case "ic":
                return stemIc(word);
            case "s":
                return stemS(word);
            case "ive":
                return stemIve(word);
            case "ize":
                return stemIze(word);
            case "ment":
                return stemMent(word);
            case "al":
                return stemAl(word);
            case "tion":
                return stemTion(word);
            default:
                return word;
        }
    }

    public String stemIng(String word) {

        if (word.length() >= 5 && (word.endsWith("nning") || word.endsWith("mming") || word.endsWith("pping") || word.endsWith("gging"))) {
            return word.substring(0, word.length() - 4);
        }

        // If the word length is greater than or equal to 5 and the word ends with "ling" or "gging", replace "ling" with "le"
        if (word.length() >= 5 && (word.endsWith("ling") || word.endsWith("gging"))) {
            return word.substring(0, word.length() - 3) + "e";
        }
        // If the word length is greater than or equal to 6 and the word ends with "izing", replace "izing" with "ize"
        if (word.length() >= 6 && word.endsWith("izing")) {
            return word.substring(0, word.length() - 3) + "e";
        }

        // If the word length is greater than or equal to 5 and the word ends with "ating", replace "ating" with "ate"
        if (word.length() >= 5 && word.endsWith("ating")) {
            return word.substring(0, word.length() - 3) + "e";
        }

        // If the word length is greater than or equal to 3 and the word ends with "ing", remove "ing" from the end
        if (word.length() >= 3 && word.endsWith("ing")) {
            return word.substring(0, word.length() - 3);
        }

        // If the word length is greater than or equal to 4 and the word ends with "ying", replace "ying" with "y"
        if (word.length() >= 4 && word.endsWith("ying")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        // Return the original word if it doesn't match any of the rules
        return word;
    }


    public String stemEd(String word) {
        if (word.length() >= 6 && word.endsWith("ceed")) {
            return word.substring(0, word.length() - 3) + "ess";
        }
        // If word length is greater than or equal to 6 and the word ends with eed, remove d from last
        if (word.length() >= 6 && word.endsWith("eed")) {
            return word.substring(0, word.length() - 1);
        }

        if (word.length() >= 6 && word.endsWith("ied")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        if (word.length() >= 5 && word.endsWith("ered")) {
            return word.substring(0, word.length() - 2);
        }

        // If word length is greater than or equal to 5 and the word ends with vowel + red or ted, remove d from last
        if (word.length() >= 5 && word.matches(".*[aeiou]red$|.*[aeiou]ted$|.*[aeiou]zed$")) {
            return word.substring(0, word.length() - 1);
        }

        // If word length is greater than or equal to 6 and the word ends with ed, remove ed from last
        if (word.length() >= 6 && word.endsWith("ed")) {
            return word.substring(0, word.length() - 2);
        }

        return word;
    }

    public String stemLy(String word) {
        // If the word length is greater than or equal to 5, apply the rules
        if (word.length() >= 5) {
            // If the word ends with aly, remove y from the end
            if (word.endsWith("aly")) {
                return word.substring(0, word.length() - 1);
            }

            // If the word ends with ily, remove ily from the end and add y
            if (word.endsWith("ily")) {
                return word.substring(0, word.length() - 3) + "y";
            }

            // If the word ends with ly, remove ly from the end
            if (word.endsWith("ly")) {
                return word.substring(0, word.length() - 2);
            }
        }

        return word;
    }

    public String stemFul(String word) {
        // If the word ends with iful, remove iful from the end and add y
        if (word.length() >= 6 && word.endsWith("iful")) {
            return word.substring(0, word.length() - 4) + "y";
        }

        // If the word ends with full, remove ful from the end
        if (word.length() >= 6 && word.endsWith("ful")) {
            return word.substring(0, word.length() - 3);
        }

        return word;
    }

    public String stemEst(String word) {
        // If the word length is greater than or equal to 6, apply the rules
        if (word.length() >= 6) {
            // If the word ends with iest, remove iest from the end and add y
            if (word.endsWith("iest")) {
                return word.substring(0, word.length() - 4) + "y";
            }

            // If the word ends with llest, remove lest from the end and add l
            if (word.endsWith("llest")) {
                return word.substring(0, word.length() - 4);
            }

            // If the word ends with est, remove est from the end
            if (word.endsWith("est")) {
                return word.substring(0, word.length() - 3);
            }
        }
        return word;


    }

    public String stemIty(String word) {
        // Check if the word length is 7 or more
        if (word.length() >= 7) {
            // Check if the word ends with ity
            if (word.endsWith("ity")) {
                // Check if the word ends with ility
                if (word.endsWith("ility")) {
                    // Remove ility and add le
                    return word.substring(0, word.length() - 5) + "le";
                }
                // Check if the word ends with vity
                else if (word.endsWith("vity")) {
                    // Remove ity and add e
                    return word.substring(0, word.length() - 3) + "e";
                }
                else if (word.endsWith("nity")) {
                    // Remove ity and add e
                    return word.substring(0, word.length() - 3) + "e";
                }
                // Otherwise, remove ity
                else {
                    return word.substring(0, word.length() - 3);
                }
            }
            // If the word does not end with ity, return the original word
            else {
                return word;
            }
        }
        // If the word length is less than 7, return the original word
        else {
            return word;
        }
    }

    public String stemNess(String word) {
        if (word.length() >= 5) {
            if (word.endsWith("iness")){
                word = word.substring(0, word.length() - 5) + "y";
            } else if (word.endsWith("ness")) {
                word = word.substring(0, word.length() - 4);
            }
        }
        return word;
    }

    public String stemEr(String word) {

        // If the word length is greater than or equal to 5 and the word ends with "ier", replace "ier" with "y"
        if (word.length() >= 5 && word.endsWith("ier")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        // If the word length is greater than or equal to 7 and the word ends with "izer", remove "er" from the end
        if (word.length() >= 7 && word.endsWith("izer")) {
            return word.substring(0, word.length() - 1);
        }
        // If the word length is greater than or equal to 4 and the word ends with "er", remove "er" from the end
        if (word.length() >= 4 && word.endsWith("er")) {
            return word.substring(0, word.length() - 2);
        }
        // Return the original word if it doesn't match any of the rules
        return word;
    }

    public String stemIc(String word) {
        // If the word length is greater than or equal to 6 and the word ends with "gic" or "mic", replace "ic" with "y"
        if (word.length() >= 6 && (word.endsWith("gic") || word.endsWith("mic"))) {
            return word.substring(0, word.length() - 2) + "y";
        }

        // If the word length is greater than or equal to 5 and the word ends with "atic", remove "ic" from the end
        if (word.length() >= 5 && word.endsWith("atic")) {
            return word.substring(0, word.length() - 2 )+ "e";
        }
        // If the word length is greater than or equal to 6 and the word ends with "ic", remove "ic" from the end
        if (word.length() >= 6 && word.endsWith("ic")) {
            return word.substring(0, word.length() - 2);
        }
        // Return the original word if it doesn't match any of the rules
        return word;
    }

    public String stemS(String word){

        if (word.endsWith("ss")){
            return word = word.substring(0, word.length());
        }
        if (word.length()>= 3 && word.endsWith("s")){
            return word = word.substring(0, word.length()-1);
        }

        return word;
    }
    public String stemIve(String word) {
        // If the word ends with "ive", remove "ive" from the end
        if (word.endsWith("ive")) {
            return word.substring(0, word.length() - 3);
        }
        // If the word does not end with "ive", return the original word
        else {
            return word;
        }
    }

    public String stemIze(String word) {
        // If the word ends with "ize", remove "ize" from the end
        if (word.endsWith("ize")) {
            return word.substring(0, word.length() - 3);
        }
        // If the word does not end with "ize", return the original word
        else {
            return word;
        }
    }

    public String stemMent(String word) {
        // If the word ends with "ment", remove "ment" from the end
        if (word.endsWith("ment")) {
            return word.substring(0, word.length() - 4);
        }
        // If the word does not end with "ment", return the original word
        else {
            return word;
        }
    }

    public String stemAl(String word) {
        // If the word ends with "al", remove "al" from the end
        if (word.endsWith("al")) {
            return word.substring(0, word.length() - 2);
        }
        // If the word does not end with "al", return the original word
        else {
            return word;
        }
    }
    public String stemTion(String word) {
        // If the word ends with "tion", remove "tion" from the end
        if (word.endsWith("tion")) {
            return word.substring(0, word.length() - 4);
        }
        // If the word does not end with "tion", return the original word
        else {
            return word;
        }
    }


}
