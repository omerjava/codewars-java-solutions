    /* dash/underscore delimited words into camel casing. The first word within the output
    should be capitalized only if the original word was capitalized (known as Upper Camel Case,
    also often referred to as Pascal case).

        Examples
        "the-stealth-warrior" gets converted to "theStealthWarrior"
        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

        https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
     */


    import java.util.Arrays;
    import java.util.Locale;

    public class ConvertStringToCamelCase{
    public static void main(String[] args) {
        System.out.println(toCamelCase("this-is-omerjava-github-account"));
        System.out.println(toCamelCase("This_is_omerjava_github_account"));
        System.out.println(toCamelCase2("This_is_my_github_account"));
    }
    static String toCamelCase(String s){
        String[] str=s.split("-|_");
        String[] result=new String[str.length];
        result[0]=str[0];
        for (int i=1; i< result.length; i++){
            String[] word=str[i].split("");
            word[0]=word[0].toUpperCase();
            String wordStr=String.join("",word);
            result[i]=wordStr;
        }
        return String.join("",result);
    }
        static String toCamelCase2(String s){
            String[] str=s.split("-|_");
            String result=str[0];
            for (int i=1; i< str.length; i++){
               result+=str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase();
            }
            return result;
        }
}
