package code_challenges_100_days;

//Implement method overloading in a Mathoperations class
public class day_45 {
    public static class Mathoperations {
        //        method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        //        overloaded method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        //        overloaded method to add two double values
        public double add(double a, double b) {
            return a + b;
        }

        //        overloaded method to add an array of integers
        public int add(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += sum;
            }
            return sum;
        }

        //        main method to test the overloaded methods
        public static void main(String[] args) {
            Mathoperations math = new Mathoperations();
            System.out.println("add (int , int) " + math.add(2, 4));
            System.out.println("add (int , int ,int) " + math.add(2, 65, 6));
            System.out.println(("add(double , double) " + math.add(34.4, 43.2)));
            System.out.println("add(int[]) " + math.add(new int[]{3, 45, 5, 56, 4, 564}));
        }
    }

}