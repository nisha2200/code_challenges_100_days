package code_challenges_100_days;
//Create a program that handles ArithmeticException and ArrayIndexOutofBoundsException.
public class day_51 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b= 0;
            int result = a/b;
            System.out.println("result:"+ result);
            //array index out of bounds exception
            int [] arr ={1,2,3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: "+ e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: "+ e.getMessage());
        }
        System.out.println("program continues....");
    }
}
