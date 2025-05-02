package code_challenges_100_days;
//Write a function to check if a string contains only digits
public class day_40 {
//    Function to check if string contains only digits
    public static  boolean isOnlyDigits(String str){
//        return false if string is empty or null
        if (str==null || str.isEmpty()){
            return false;
        }
//        check each character
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Only digits? "+isOnlyDigits(input));
    }
}
