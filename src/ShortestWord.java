// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
// Simple, given a string of words, return the length of the shortest word(s).
// String will never be empty, and you do not need to account for different data types.


public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    public static int findShort(String s) {
        String[] words=s.split(" ");
        int minWordsLength=0;
        for(int i=0; i< words.length; i++){
            boolean check=true;
            for(int j=i+1; j< words.length; j++){
                check = check && (words[i].length()-words[j].length()<0);
            }
            if(check) {
                minWordsLength=words[i].length();
                break;
            }
        }
        return minWordsLength;
    }
}
