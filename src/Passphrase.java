    /* Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references. You can get your passphrases stronger by different means. One is the following:

        choose a text in capital letters including or not digits and non-alphabetic characters,

        shift each letter by a given number but the transformed letter must be a letter (circular shift),
        replace each digit by its complement to 9,
        keep such as non-alphabetic and non digit characters,
        downcase each letter in odd position, upcase each letter in even position (the first character
        is in position 0),
        reverse the whole result.
        Example:
        your text: "BORN IN 2015!", shift 1

        1 + 2 + 3 -> "CPSO JO 7984!"

        4 "CpSo jO 7984!"

        5 "!4897 Oj oSpC"

        With longer passphrases it's better to have a small and easy program. Would you write it?

        https://en.wikipedia.org/wiki/Passphrase

        https://www.codewars.com/kata/559536379512a64472000053/train/java
     */

public class Passphrase {

    public static void main(String[] args) {
        System.out.println(playPass("BORN IN 2015!",27));
        System.out.println(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015",7));
    }

    public static String playPass(String s, int n) {
        String[] sArr=s.split("");
        String alphabetStr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphabetArr=alphabetStr.split("");
        String numbers="0123456789";
        for(int i=0; i<sArr.length; i++){
            if(alphabetStr.contains(sArr[i])){
                int index=alphabetStr.indexOf(sArr[i]);
                sArr[i]=alphabetArr[(index+n)%26];
            }
        }
        for(int i=0; i<sArr.length; i++){
            if(numbers.contains(sArr[i])){
                int complementTo9=9-Integer.parseInt(sArr[i]);
                sArr[i]=String.valueOf(complementTo9);
            }
        }
        for(int i=0; i<sArr.length; i++){
            if(i%2==0) sArr[i]=sArr[i].toUpperCase();
            else sArr[i]=sArr[i].toLowerCase();
        }
        String result="";
        for(int i=sArr.length-1; i>=0; i--){
            result+=sArr[i];
        }
        return result;
    }
}
