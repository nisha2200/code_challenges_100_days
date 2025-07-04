package code_challenges_100_days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort a list of custom objects (e.g. Student with name and marks) using comparator
public class day_69 {
    static class Student{
        String name;
        int marks;
        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }
//        to display student info
        public String toString(){
            return name + ":"+ marks;
        }
    }
    public void main(String[] args) {
//        list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aditya", 26));
        students.add(new Student("Nisha",21));
        students.add(new Student("Sneha",20));
        students.add(new Student("Om",19));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.marks  ,s2.marks);
            }
        });
        System.out.println("Sorted by marks: ");
        for (Student s: students){
            System.out.println(s);
        }
//        sort by name
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("Sorted by name: ");
        for (Student s :students){
            System.out.println(s);
        }
    }
}
