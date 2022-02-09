/* You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"

https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
 */

public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("friends"));
        System.out.println(getMiddle("a"));
        System.out.println(getMiddle("friend"));
    }
    public static String getMiddle(String word) {
        return word.length()==1 ? word: word.length() % 2 == 0 ? word.substring(word.length()/2-1,word.length()/2+1):
                word.substring((int) Math.floor(word.length()/2), (((int) Math.ceil(word.length()/2))+1));
    }
}
