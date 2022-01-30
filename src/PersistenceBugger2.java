/* Write a function, persistence, that takes in a positive parameter. You must multiply
the digits in num, if the multiplication result is not single digit number, you should repeat it
until you reach a single digit as return. If parameter is smaller than 10, return should be 0.

For example (Input --> Output):

39 --> 4 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 2 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)

Inspired from kata below:
https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
 */

import java.util.Arrays;

public class PersistenceBugger2 {
    public static void main(String[] args) {
        System.out.println(persistence2(4));
        System.out.println(persistence2(999));
        System.out.println(persistence2(39));
    }
    public static int persistence2(long n) {
        if(n<=9) return 0;
        String[] digits=String.valueOf(n).split("");
        int multiplication=1;
        for (String element:digits){
            multiplication*=Integer.parseInt(element);
        }
        return multiplication>=10 ? persistence2(multiplication) : multiplication;
    }
}

