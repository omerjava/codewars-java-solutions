import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstKataBugs{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortEvenNumbersInArray(new int[]{4, 3, 5, 15, 2, 0, 7, 1, 12, 10})));
    }
    public static int[] sortEvenNumbersInArray(int[] array) {
        int[] sortedEvens=IntStream.of(array).sorted().filter(v -> v%2==0).toArray();
        int j=0;
        for(int i=0; i< array.length;i++) {
            if (array[i] % 2 == 0) {
                array[i] = sortedEvens[j];
                j++;
            }
        }
        return array;
    }
}
