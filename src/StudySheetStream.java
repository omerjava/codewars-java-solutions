import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;


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

        String[] words=new String[]{"hello", "my", "name", "", "is", "Omer"};
        String[] filtered= Stream.of(words).filter(v->v.length()!=0).toArray(String[]::new);
        System.out.println(Arrays.toString(filtered));

        String[] array = {"a", "b", "c", "d", "e"};

        //Arrays.stream  https://mkyong.com/java8/java-how-to-convert-array-to-stream/
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);

        //Stream.of
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(x -> System.out.println(x));

    }
}
