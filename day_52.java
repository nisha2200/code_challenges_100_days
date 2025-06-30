package code_challenges_100_days;
//Create a custom eception class called InvalidAgeException
public class day_52 {
        class InvalidAgeException extends Exception{
            public InvalidAgeException(String message){
                super(message);
            }
        }
        public class AgeCheck{
           static void validateAge(int age) throws InvalidAgeException{
                if (age<18){
                    throw  new InvalidAgeException("age is less than 18 , not eligible.");
                }else{
                    System.out.println("valid age, you are eligible");
                }
            }
    public static void main(String[] args) {
                try {
                    validdateAge(16);
                }catch (InvalidAgeException e){
                    System.out.println("caught exception: "+e.getMessage());
                }

        }
    }
}
