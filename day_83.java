package code_challenges_100_days;

//Create a functional interface and use it with lambda.
public class day_83 {
    interface Calculator {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
//            Lambda expression for addition
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
//        using the functional interface with lambda
        System.out.println("Addition: " + add.operation(10, 20));
        System.out.println("Multiplication: " + add.operation(10, 20));
    }
}
