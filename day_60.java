package code_challenges_100_days;
//Demonstrate use of throws and throw keywords in a simple program.
public class day_60 {
    static int divide(int a , int b) throws ArithmeticException{
        if (b==0){
//            throwing an exception manually
            throw new ArithmeticException("cannot divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        try{
            int result = divide(10 ,0); // will throw exception
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("exception caught: "+e.getMessage());
        }
        System.out.println("program continues after exception handling.");
    }
}
