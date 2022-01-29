    /* https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java

        In simple terms, our method does not like the principle of carrying over
        numbers and just writes down every number it calculates :-)

        You may assume both integers are positive integers.

     */

public class SumDifferently {
    public static void main(String[] args) {
        System.out.println(add(248, 19)); //output 2517
    }
    public static int add(int num1,int num2){
        String str1=String.valueOf(num1);
        String str2=String.valueOf(num2);
        int n=str1.length()-str2.length();
        if(n>0){
            String zeros2="";
            for(int i=0; i<n; i++){
                zeros2+="0";
            }
            str2=zeros2+str2;
        }
        else if(n<0) {
            String zeros1 = "";
            for (int i = 0; i < (-n); i++) {
                zeros1 += "0";
            }
            str1=zeros1+str1;
        }
        String[] digits1=str1.split("");
        String[] digits2=str2.split("");
        String result="";
        for(int i=0; i<digits1.length; i++){
            result+=String.valueOf(Integer.parseInt(digits1[i])+Integer.parseInt(digits2[i]));
        }
        return Integer.parseInt(result);
    }
}
