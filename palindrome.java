/*
 * Purpose/Description: This program checks if a String is a palindrome  
 */

package assignment1problem3a;

public class Assignment1Problem3a {

    public static void main(String[] args) {
        System.out.println("Problem Three (A)");
        String word = "nurses run";
        //check if word is a palindrome
        checkPalindrome(word);

    }
    //this method returns word reversed
    public static String reverse(String word) {
        if (word.length() - 1 >= 0) {
            return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));

        }
        return "";
    }
    
    //checks if word is a palindrome
    public static void checkPalindrome(String word){

        //take out all of the spaces
        word = word.replaceAll(" ", "");

        //aWord saves word reversed
        String aWord = reverse(word);

        // check if aWord is equal to word (check if the word/ string that was entered is the same
        // as the reverse of that string)
        if (word.equalsIgnoreCase(aWord)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }

    }


}
