        /* Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.

        The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

        It is much easier to understand with an example:

        * For seconds = 62, your function should return
        "1 minute and 2 seconds"
        * For seconds = 3662, your function should return
        "1 hour, 1 minute and 2 seconds"
        For the purpose of this Kata, a year is 365 days and a day is 24 hours.

        Note that spaces are important.
        https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java
         */

        import java.util.ArrayList;
        import java.util.List;

public class ReadableTimeFormat {
    public static void main(String[] args) {
        System.out.println(formatDuration(360355600));
        System.out.println(formatDuration(12));
        System.out.println(formatDuration(122));
        System.out.println(formatDuration(0));
    }
    public static String formatDuration(int seconds) {
        if(seconds==0) return "now";
        int second=seconds%60;
        int minutes=(seconds/60)%60;
        int hours=((seconds/60)/60)%24;
        int days=((seconds/60)/60/24)%365;
        int years=((seconds/60)/60/24)/365;
        List<String> list=new ArrayList<>();
        if(years!=0){
            if(years==1) list.add("1 year");
            else list.add(years+ " years");
        }
        if(days!=0){
            if(days==1) list.add("1 day");
            else list.add(days+ " days");
        }
        if(hours!=0){
            if(hours==1) list.add("1 hour");
            else list.add(hours+ " hours");
        }
        if(minutes!=0){
            if(minutes==1) list.add("1 minute");
            else list.add(minutes+ " minutes");
        }
        if(second!=0){
            if(second==1) list.add("1 second");
            else list.add(second+ " seconds");
        }
        String result="";
        for(int i=0; i< list.size(); i++){
            if(list.size()==1) result=list.get(i);
            else if(i== list.size()-2) result+= list.get(i)+" and ";
            else if(i== list.size()-1) result+= list.get(i);

            else result+= list.get(i)+", ";
        }
        return result;
    }
}
