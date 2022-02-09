package studySheets;

import java.util.HashMap;

public class HashMapStudySheet {
    public static void main(String[] args) {
        HashMap<String, String> myHashmap= new HashMap<>();
        myHashmap.put("England", "London");
        myHashmap.put("Germany", "Berlin");
        myHashmap.put("Poland", "Warsaw");
        myHashmap.put("Belgium", "Brussels");

        System.out.println(myHashmap);

        HashMap<String,Integer> countCharMap=new HashMap<>();
        String str="Everybody is happy here";
        String[] arr=str.split("");
        for(int i=0; i<str.length();i++){
            int value=1;
            if(countCharMap.containsKey(arr[i])){
                value=countCharMap.get(arr[i])+1;
            }
            countCharMap.put(arr[i], value);
        }
        System.out.println(countCharMap);
    }

}
