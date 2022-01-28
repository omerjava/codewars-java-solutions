    /* This time no story, no theory. The examples below show you how to write function accum:

        Examples:
        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"

        https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

     */

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("helloWorld"));
    }
    public static String accum(String s) {
        String[] strArr=s.split("");
        String result="";
        for(int i=0; i<strArr.length; i++){
            result+=repeat(strArr[i],i)+"-";
        }
        return result.substring(0,result.length()-1);
    }
    public static String repeat(String s, int n) {
        String result=s.toUpperCase();
        for(int i=0; i<n; i++){
            result+=s.toLowerCase();
        }
        return result;
    }
}
