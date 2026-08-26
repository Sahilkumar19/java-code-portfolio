/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class IsPangram {
    public static void main(String[] args) {
        String sentence="\"thequickbrownfoxjumpsoverthelazydog\"";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);

    }
    public static boolean checkIfPangram(String sentence) {

        // Array 'seen' of size 26.

        boolean[] seen = new boolean[26];

        // For every letter 'currChar', we find its ASCII code,

        // and update value at the mapped index as true.

        for (char currChar : sentence.toCharArray())

            seen[currChar - 'a'] = true;

        // Once we finish iterating, check if 'seen' contains false.

        for (boolean status : seen)

            if (!status)

                return false;

        return true;

    }
}
