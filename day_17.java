package code_challenges_100_days;

import java.util.Arrays;

//Wap to merge to check if two strings are anagrams
public class day_17 {
    public  static  boolean setAnagrams(String str1, String str2){
//        Remove spaces and convert  to lowercase
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
//        if lengths are different, not anagrams
        if (str1.length()!= str2.length()){
            return false;
        }
//        convert to char arrays and sort
        char[] arr1= str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str1 = "open";
        String str2 = "nopes";
        if (setAnagrams(str1,str2)){
            System.out.println(str1+" and "+str2 +" are anagrams");
        }else {
            System.out.println(str1 + " and "+ str2+" are Not anagrams.");
        }
    }
}
