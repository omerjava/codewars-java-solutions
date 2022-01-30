    /* Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

        It should remove all values from list a, which are present in list b keeping their order.

        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
        If a value is present in b, all of its occurrences must be removed from the other:

        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}
     */

    import java.util.ArrayList;
    import java.util.Arrays;

    // there are 3 solution methods below for this challenge.they look ok in my tests but...
    // codewars test gives error of "array lengths differed, expected.length=2 actual.length=4"
public class ArrayDifference {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff1(new int[]{1, 2, 2, 2, 3,3,4,4}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff1(new int [] {1,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff1(new int [] {}, new int[] {1,2})));
        System.out.println(Arrays.toString(arrayDiff2(new int [] {1,2,2,7,7,7,3,4,5}, new int[] {1,2,5})));
        System.out.println(Arrays.toString(arrayDiff3(new int [] {1,2,3,4,5}, new int[] {1,2,5})));
    }
    public static Integer[] arrayDiff1(int[] a, int[] b) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : a) {
            boolean check=true;
            for(int element : b){
                check = check && (number!=element);
            }
            if(check) resultList.add(number);
        }
        return resultList.toArray(new Integer[0]);
    }
        public static int[] arrayDiff2(int[] a, int[] b) {
            StringBuilder result= new StringBuilder();
            for (int number : a) {
                boolean check=true;
                for(int element : b){
                    check = check && (number!=element);
                }
                if(check) result.append(number);
            }
            int[] resultInt=new int[result.length()];
            String[] resultStr= result.toString().split("");
            for(int i=0; i< resultInt.length; i++){
                resultInt[i]=Integer.parseInt(resultStr[i]);
            }
            return resultInt;
        }
        public static int[] arrayDiff3(int[] a, int[] b) {
            String result="";
            for (int number : a) {
                boolean check=true;
                for(int element : b){
                    check = check && (number!=element);
                }
                if(check) result+=String.valueOf(number);
            }
            int[] resultInt=new int[result.length()];
            String[] resultStr=result.split("");
            for(int i=0; i< resultInt.length; i++){
                resultInt[i]=Integer.parseInt(resultStr[i]);
            }
            return resultInt;
        }
}
