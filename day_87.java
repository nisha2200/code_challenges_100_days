package code_challenges_100_days;

import java.util.Arrays;
import java.util.List;

//Demonstrate method reference using static and instance methods.
public class day_87 {
    public static class MethodReferenceExample {
        //        static method
        public static void printStatic(String message) {
            System.out.println("Static Method: " + message);
        }

        //        Instance method
        public void printInstance(String message) {
            System.out.println("Instance Method: " + message);
        }

        public void main(String[] args) {
            List<String> names = Arrays.asList("ALice", "bob", "nike", "kiln");
//            Method reference to static method
//            Consumer<String> staticRef = MethodReferenceExample::printStatic;
            names.forEach(MethodReferenceExample::printStatic);
            System.out.println();
//            Method reference to instance method
            MethodReferenceExample obj = new MethodReferenceExample();
            names.forEach(obj::printInstance);
        }
    }
}