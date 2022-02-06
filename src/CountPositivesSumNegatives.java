        /* Given an array of integers.

        Return an array, where the first element is the count of positives numbers and the second
        element is sum of negative numbers. 0 is neither positive nor negative.

        If the input array is empty or null, return an empty array.

        Example
        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

        https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/javascript
         */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                refactored(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(
                countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(
                countPositivesSumNegatives(new int[]{})));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input==null || input.length==0) return new int[]{};
        else {
            List<Integer> numbers = Arrays.stream(input).boxed().collect(Collectors.toList());
            List<Integer> positiveNumbers = numbers.stream().filter(v -> v > 0).collect(Collectors.toList());
            Integer sumOfNegativeNumbers = numbers.stream().filter(v -> v < 0).reduce(0, (acc, v) -> acc + v);
            int countPositiveNumbers = positiveNumbers.size();
            int sumOfNegatives = sumOfNegativeNumbers;
            return new int[]{countPositiveNumbers, sumOfNegatives};
        }
    }
    public static int[] refactored(int[] input) {
        if (input==null || input.length==0) return new int[]{};
        else {
            List<Integer> numbers = Arrays.stream(input).boxed().collect(Collectors.toList());
            int countPositives = numbers.stream().filter(v -> v > 0).toList().size();
            int sumOfNegatives = numbers.stream().filter(v -> v < 0).reduce(0, Integer::sum);
            return new int[]{countPositives, sumOfNegatives};
        }
    }
}
