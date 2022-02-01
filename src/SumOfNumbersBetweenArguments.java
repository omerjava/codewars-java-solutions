/* Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

        Note: a and b are not ordered!

        Examples (a, b) --> output (explanation)
        (1, 0) --> 1 (1 + 0 = 1)
        (1, 2) --> 3 (1 + 2 = 3)
        (0, 1) --> 1 (0 + 1 = 1)
        (1, 1) --> 1 (1 since both are same)
        (-1, 0) --> -1 (-1 + 0 = -1)
        (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

    https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
 */

public class SumOfNumbersBetweenArguments {
    public static void main(String[] args) {
        System.out.println(GetSum(-5,12));
        System.out.println(GetSum2(12,-5));
    }
    public static int GetSum(int a, int b) {
        if(a==b) return a;
        int begin = 0;
        int end = 0;
        if(a>b) {
            begin=b;
            end=a;
        }
        else{
            begin=a;
            end=b;
        }
        int sum=0;
        for(int i=begin; i<end+1; i++){
            sum+=i;
        }
        return sum;
    }
    public static int GetSum2(int a, int b) {
        if(a==b) return a;
        int sum=0;
        for(int i=Math.min(a,b); i<Math.max(a,b)+1; i++){
            sum+=i;
        }
        return sum;
    }

}
