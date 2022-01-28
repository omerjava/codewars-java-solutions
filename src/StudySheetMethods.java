public class StudySheetMethods {

    public static void main(String[] args) {
        System.out.println(reverse("5348"));
        System.out.println(rotate("5348"));
        System.out.println(isSumOfCubesOfDigitsDivisibleBy2("5348"));
    }


    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String rotate(String str){
        String[] digits=str.split("");
        String[] rotatedDigits=new String[digits.length];
        for(int i=1; i<digits.length; i++){
            rotatedDigits[i-1]=digits[i];
        }
        rotatedDigits[rotatedDigits.length-1]=digits[0];
        return String.join("", rotatedDigits);
    }
    public static Boolean isSumOfCubesOfDigitsDivisibleBy2(String str) {
        String[] digits = str.split("");
        int sum = 0;
        for (String digit : digits){
            sum += Math.pow(Integer.parseInt(digit), 3);
        }
        return sum % 2 == 0;
    }
}
