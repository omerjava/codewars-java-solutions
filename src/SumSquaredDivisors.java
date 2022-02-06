        /*
        1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246. Squaring these divisors we get: 1, 60516, 4,
        15129, 9, 6724, 36, 1681. The sum of these squares is 84100 which is 290 * 290.

        Task
        Find all integers between m and n (m and n integers with 1 <= m <= n) such that the sum of their
        squared divisors is itself a square.

        We will return an array of subarrays or of tuples (in C an array of Pair) or a string. The subarrays
        (or tuples or Pairs) will have two elements: first the number the squared divisors of which is a square
        and then the sum of the squared divisors.

        Example:
        list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
        list_squared(42, 250) --> [[42, 2500], [246, 84100]]
        The form of the examples may change according to the language, see "Sample Tests".
        https://www.codewars.com/kata/55aa075506463dac6600010d/train/java
         */

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.IntStream;

public class SumSquaredDivisors {
    public static void main(String[] args) {
        System.out.println(listSquared(1,250));
        System.out.println(isSpecialNumber2(250));
    }
    public static String listSquared(long m, long n) {
        String result="[";
        for(long i=m; i<n+1; i++){
            if(isSpecialNumber((int) i)!=0){
                result+="["+(int) i+", " +isSpecialNumber((int) i)+"], ";
            }
        }
        return result.length()==1 ? result+"]" : result.substring(0,result.length()-2)+"]";
    }

    static int isSpecialNumber(int num){
        List<String> numbers=new ArrayList<>();
        for(int i=1; i<num+1; i++){
             if(num%i==0) numbers.add(String.valueOf(i));
        }
        int squaredSum= numbers.stream().map(v -> Integer.parseInt(v)*Integer.parseInt(v))
                .reduce(0, Integer::sum);
        return Math.sqrt(squaredSum)%1==0 ? squaredSum : 0;
    }
    static int isSpecialNumber2(int num){
        int sumOfSquared = IntStream.range(1,num+1).filter(v -> num%v==0).map(v -> v*v).sum();
        //int[] squaredNumbers = IntStream.range(1,num+1).filter(v -> num%v==0).map(v -> v*v).toArray();
        //System.out.println(Arrays.toString(squaredNumbers));
        return Math.sqrt(sumOfSquared)%1==0 ? sumOfSquared : 0;
    }
}
