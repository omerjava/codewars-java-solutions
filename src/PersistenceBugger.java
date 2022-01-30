        /* Write a function, persistence, that takes in a positive parameter num and returns
        its multiplicative persistence, which is the number of times you must multiply the digits
        in num until you reach a single digit.

        For example (Input --> Output):

        39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
        4 --> 0 (because 4 is already a one-digit number)
        https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java

         */

        import java.util.Arrays;

        public class PersistenceBugger {
    public static void main(String[] args) {
        System.out.println(persistence(4));
        System.out.println(persistence(999));
        System.out.println(persistence(39));
    }
    public static int persistence(long n) {
        int timesRepeat=0;
        if(n<=9) return 0;
        for(int i=0; i<100; i++) {
            String[] digits = String.valueOf(n).split("");
            int multiplication = 1;
            for (String element : digits) {
                multiplication *= Integer.parseInt(element);
            }
            n=multiplication;
            timesRepeat++;
            if(n<10) break;
        }
        return timesRepeat;
    }
}
