//WAP to count vowels and consonant in a string
package code_challenges_100_days;

import javax.crypto.spec.PSource;

public class day_9 {
    public  class  vowelConsonantCount{
        static  void countVowelsConsonants(String str){
            int vowels =0, consonants=0;
            str = str.toLowerCase();
            for (char ch: str.toCharArray()){
                if (Character.isLetter(ch)){
                    if ("aeiou".indexOf(ch)!= -1){
                        vowels++;
                    }else {
                        consonants++;
                    }
                }
            }
        }


    }
    public static void main(String[] args) {

    }
}
