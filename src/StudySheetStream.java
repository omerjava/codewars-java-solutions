import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.IntStream;


public class StudySheetStream {

    public static void main(String[] args) {
        int a=-2;
        int b=3;
        int result= IntStream.range(a, b + 1).sum();

        System.out.println(result);

        int[] numbers={3,5,7,-4,0,65};
        int result2=IntStream.of(numbers).min().getAsInt();
        System.out.println(result2);
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

    }
}
