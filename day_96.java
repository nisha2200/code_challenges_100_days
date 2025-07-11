package code_challenges_100_days;

import java.util.ArrayList;
import java.util.Scanner;

//Mini project: Study Management System using ArrayList.
    class Student{
        int id;
        String name;
        String course;
//        constructor
        Student(int id, String name , String course){
            this.id=id;
            this.name = name;
            this.course=course;
        }
//        Display student details
        void display(){
            System.out.println("ID:"+id);
            System.out.println("Name: "+name);
            System.out.println("Course: "+course);
            System.out.println("----------------------");
        }
    }
public class day_96 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("---Study Management System---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Student Name: ");
                    sc.nextLine();// consume newline
                    String name = sc.nextLine();
                    System.out.println("Enter Course: ");
                    String course = sc.nextLine();
                    students.add(new Student(id, name,course));
                    System.out.println("Student added successfully! ");
                    break;
                case 2:
                    if (students.isEmpty()){
                        System.out.println("No students found.");
                    }else {
                        System.out.println("---Student List---");
                        for (Student s: students){
                            s.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Student ID to search: ");
                    int serachID = sc.nextInt();
                    boolean found = false;
                    for (Student s: students){
                        if (s.id == serachID){
                            System.out.println("Student Found: ");
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Student not found. ");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }while (choice!=4);
    }
}
