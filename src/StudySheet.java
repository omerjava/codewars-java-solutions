import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StudySheet {
    public static void main(String[] args) {
        int complementTo9 = 9 - Integer.valueOf("8");
        int complementTo8 = 8 - Integer.parseInt("5");
        String number = String.valueOf(complementTo9) + 6;
        String n = Integer.toString(6) + 7;

        System.out.println(complementTo9);
        System.out.println(complementTo8);
        System.out.println(number);
        System.out.println(n);

        String str = "hello!?";
        char c = str.charAt(3);
        char d = str.charAt(5);
        if (Character.isLetter(c)) {
            System.out.println(true);
        }
        if (!Character.isLetter(d)) {
            System.out.println(false);
        }
        int x = 574839;
        int[] result = new StringBuilder(String.valueOf(x))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        System.out.println(Arrays.toString(result));

        String[] nums = new StringBuilder(String.valueOf(x)).reverse().toString().split("");
        System.out.println(Arrays.toString(nums));

        int[] result2 = new StringBuilder().append(x)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        System.out.println(Arrays.toString(result2));

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        int num = myInt.intValue();
        char y = myChar.charValue();

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(num);
        System.out.println(y);

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());

        String chunk = "2345678".substring(0, 4);
        System.out.println(chunk);

        float myFloat = x; //your float
        double double1 = (double) myFloat;

        double ddd = 23456;
        float ff = (float) ddd;
        String strX = "563000655734469485";
        String[] chunks = new String[(int) Math.floor((double) strX.length() / 4)];
        System.out.println(chunks.length);

        ArrayList<String> carsList = new ArrayList<>();
        ArrayList<Integer> numbersList = new ArrayList<>();
        Integer[] array = numbersList.toArray(new Integer[0]);
        //
        String digits = String.valueOf(345627);
        int sum = 0;
        int p=0;
        for (int i = 0; i < digits.length(); ++i, ++p){
            sum += Math.pow(Character.getNumericValue(digits.charAt(i)), p);
        }
            System.out.println(sum);
        //
        int number1=234765;
        int[] digits2 = String.valueOf(number1).chars().map(Character::getNumericValue).toArray();
        for(int element : digits2) {
            System.out.println(element);
        }

        int sum2 = IntStream.range(0, digits2.length).map(i -> (int) Math.pow(digits2[i], i + 5)).sum();
            System.out.println(sum2);

        //
        int[] args2={45,7,89,3,-5,4,-88};
        int result3= IntStream.of(args2).min().getAsInt();
        System.out.println(result3);
    }
}