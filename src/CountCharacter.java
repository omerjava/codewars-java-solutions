       /*You are going to be given a word. Your job will be to make sure that each character in that word has the
       exact same number of occurrences.
       You will return true if it is valid, or false if it is not.

        For this kata, capitals are considered the same as lowercase letters. Therefore: "A" == "a"

        The input is a string (with no spaces) containing [a-z],[A-Z],[0-9] and common symbols. The length will
        be 0 < length < 100.

        Examples
        "abcabc" is a valid word because "a" appears twice, "b" appears twice, and"c" appears twice.
        "abcabcd" is NOT a valid word because "a" appears twice, "b" appears twice, "c" appears twice, but "d" only appears once!
        "123abc!" is a valid word because all of the characters only appear once in the word.
        https://www.codewars.com/kata/56786a687e9a88d1cf00005d/train/java
        */

import java.util.HashMap;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println(validateWord("abcAbcabc"));
        System.out.println(validateWord("abcabcaabc"));
        System.out.println(countChars("i studied a lot today"));
    }
    public static boolean validateWord(String word) {
        HashMap<String,Integer> charMap=new HashMap<>();
        String[] charArr=word.toLowerCase().split("");
        for(int i=0; i<word.length(); i++){
            int value=1;
            if(charMap.containsKey(charArr[i])){
                value=charMap.get(charArr[i])+1;
            }
            charMap.put(charArr[i], value);
        }
        System.out.println(charMap);
        int elementValue=charMap.get(charArr[0]);
        boolean check=true;
        for(int value : charMap.values()){
            check=check && elementValue==value;
        }
        return check;
    }
    public static HashMap<String,Integer> countChars(String word) {
               String[] chars = word.split("");
               HashMap<String, Integer> map = new HashMap<>();
               for (int i = 0; i < chars.length; i++) {
                   int value = 1;
                   if (map.containsKey(chars[i])) {
                       value = map.get(chars[i]) + 1;
                   }
                   map.put(chars[i], value);
               }
               return map;
    }
}
