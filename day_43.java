package code_challenges_100_days;

//Create a student class with a constructor and a method to display details.
public class day_43 {
    public static class Student {
        //        Attributes
        private String name;
        private int rollNumber;
        private String course;

        //        constructor
        public Student(String name, int rollNumber, String course) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.course = course;
        }

        //        method to display student details
        public void displayDetails() {
            System.out.println("Student Details: ");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Course: " + course);
        }

        //        main method to test the class
        public static void main(String[] args) {
            Student object = new Student("nisha",65,"btech");
            object.displayDetails();
        }
    }
}
