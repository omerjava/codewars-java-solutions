    /* Complete the method so that it formats the words into a single comma separated value. The last word should be separated by the word 'and' instead of a comma. The method takes in an array of strings and returns a single formatted string.

        Note:

        Empty string values should be ignored.
        Empty arrays or null/nil/None values being passed into the method should result in an empty
        string being returned.
        Example: (Input --> output)

        ['ninja', 'samurai', 'ronin'] --> "ninja, samurai and ronin"
        ['ninja', '', 'ronin'] --> "ninja and ronin"
        [] -->""
        https://www.codewars.com/kata/51689e27fe9a00b126000004/train/java
     */

import java.util.stream.Stream;

public class FormatWords {
    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"ninja", "", "ronin"}));
        System.out.println(formatWords(new String[]{"ninja", "samurai", "ronin"}));
        System.out.println(formatWords(new String[]{}));
        System.out.println(formatWords(new String[]{""}));
        System.out.println(formatWords(null));
    }
    public static String formatWords(String[] words) {
        if(words==null) return "";
        if(words.length==0) return "";
        String[] filtered= Stream.of(words).filter(v->v.length()!=0).toArray(String[]::new);
        if(filtered.length==0) return "";
        String result="";
        for(int i=0; i< filtered.length; i++){
                if (filtered.length == 1) result = filtered[0];
                else if (filtered[i] == filtered[filtered.length - 1]) result += filtered[i];
                else if (filtered[i] == filtered[filtered.length - 2]) result += filtered[i] + " and ";
                else result += filtered[i] + ", ";
        }
        return result;
    }
}
