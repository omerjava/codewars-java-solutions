        /* This is a very simply formulated task. Let's call an integer number N 'green'
        if N² ends with all of the digits of N. Some examples:

        5 is green, because 5² = 25 and 25 ends with 5.

        11 is not green, because 11² = 121 and 121 does not end with 11.

        376 is green, because 376² = 141376 and 141376 ends with 376.

        Your task is to write a function green that returns the nth green number, starting
        with 1 - green (1) == 1

        Input range
        n <= 5000

        https://www.codewars.com/kata/584dee06fe9c9aef810001e8/train/java
         */
//not yet solved
import java.math.BigInteger;

        public class GreenNumbers {
    public static void main(String[] args) {
        System.out.println(isGreenNumber(BigInteger.valueOf(11)));
        System.out.println(isGreenNumber(BigInteger.valueOf(11)));
        System.out.println(isGreenNumber(BigInteger.valueOf(154353451)));
        System.out.println(get(10));
    }

    public static BigInteger get(int n) {
        BigInteger[] greenNumbers=new BigInteger[n];
        int i=1;
        int j=0;
        while (i>0){
                if (isGreenNumber(BigInteger.valueOf(i))){
                    greenNumbers[j] = BigInteger.valueOf(i);
                    j++;
                }
                if (j==n-1) {break;}
                i++;

        }

        return greenNumbers[n-1];
    }
    public static boolean isGreenNumber(BigInteger n) {
        String[] digits=String.valueOf(n).split("");
        int numberOfDigits= digits.length;
        String squareOfN=String.valueOf(n.multiply(n));
        return (squareOfN.substring(squareOfN.length() - numberOfDigits)).equals(String.valueOf(n));
    }
}
