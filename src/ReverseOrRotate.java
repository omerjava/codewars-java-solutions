/*
The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of
the initial string) of size sz (ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2,
reverse that chunk; otherwise rotate it to the left by one position. Put together these modified
chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
Examples:
revrot("123456987654", 6) --> "234561876549"
revrot("123456987653", 6) --> "234561356789"
revrot("66443875", 4) --> "44668753"
revrot("66443875", 8) --> "64438756"
revrot("664438769", 8) --> "67834466"
revrot("123456779", 8) --> "23456771"
revrot("", 8) --> ""
revrot("123456779", 0) --> ""
revrot("563000655734469485", 4) --> "0365065073456944"
Example of a string rotated to the left by one position:
s = "123456" gives "234561".
https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991
*/


public class ReverseOrRotate {
    public static void main(String[] args) {
        System.out.println((revRot("563000655734469485", 4)));
    }
    public static String revRot(String str, int sz) {
            if(sz==0) return "";
            if(sz>str.length()) return "";
            String[] chunks=new String[(int)Math.floor((double)str.length()/sz)];
            for(int i=0; i< chunks.length; i++){
                String chunk=str.substring(i*sz,sz+(i*sz));
                chunks[i]=chunk;
            }
            String [] result=new String[chunks.length];
            for(int i=0; i<chunks.length; i++){
                if(isSumOfCubesOfDigitsDivisibleBy2(chunks[i])) result[i] = reverse(chunks[i]);
                else result[i] = rotate(chunks[i]);
            }
            return String.join("",result);
    }
    public static String reverse(String str){
           return new StringBuilder(str).reverse().toString();
    }
    public static String rotate(String str){
            String[] digits=str.split("");
            String[] rotatedDigits=new String[digits.length];
            for(int i=1; i<digits.length; i++){
                rotatedDigits[i-1]=digits[i];
            }
            rotatedDigits[rotatedDigits.length-1]=digits[0];
            return String.join("", rotatedDigits);
    }
    public static Boolean isSumOfCubesOfDigitsDivisibleBy2(String str) {
            String[] digits = str.split("");
            int sum = 0;
            for (String digit : digits){
                sum += Math.pow(Integer.parseInt(digit), 3);
            }
            return sum % 2 == 0;
    }
}
