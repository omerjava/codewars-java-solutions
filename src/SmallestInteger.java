        /* Given an array of integers your solution should find the smallest integer.

        For example:

        Given [34, 15, 88, 2] your solution will return 2
        Given [34, -345, -1, 100] your solution will return -345
        You can assume, for the purpose of this kata, that the supplied array will not be empty.

        https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

         */

public class SmallestInteger {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{34, 2, 1, 2}));
        System.out.println(findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));

    }
    public static int findSmallestInt(int[] args) {
                int result=0;
        for(int i=0; i< args.length; i++){
            boolean check=true;
            for (int j=i+1; j< args.length; j++){
                check = check && (args[i]<args[j]);
            }
            if(check) {
                result = args[i];
                break;
            }
        }
        return result;
    }
}
