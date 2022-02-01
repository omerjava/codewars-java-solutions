/*  https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
        It's pretty straightforward. Your goal is to create a function that removes the first and
        last characters of a string. You're given one parameter,
        the original string. You don't have to worry with strings with less than two characters.

 */


public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("-Hello, this is omer java github account!"));
        System.out.println(solution2("-Hello, this is omer java github account!"));
    }

    public static String remove(String str) {
        String[] characters=str.split("");
        String result="";
        for(int i=1; i<characters.length-1; i++){
            result+=characters[i];
        }
        return result;
    }
    public static String solution2(String str) {
        return str.substring(1,str.length()-1);
    }
}
