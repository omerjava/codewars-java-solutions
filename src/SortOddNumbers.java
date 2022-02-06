        /*      Task
        You will be given an array of numbers. You have to sort the odd numbers in ascending order
        while leaving the even numbers at their original positions.

        Examples
        [7, 1]  =>  [1, 7]
        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
        https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
         */

        import java.util.Arrays;
        import java.util.stream.IntStream;

        public class SortOddNumbers {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(sortArray(new int[]{4, 3, 5, 15, 6, 8, 7, 1})));
        }
        public static int[] sortArray(int[] array) {
            int[] sortedOdds=IntStream.of(array).sorted().filter(v -> v%2!=0).toArray();
            int j=0;
            for(int i=0; i< array.length;i++) {
                if (array[i] % 2 != 0) {
                    array[i] = sortedOdds[j];
                    j++;
                }
            }
            return array;
        }
}
