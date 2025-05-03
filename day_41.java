package code_challenges_100_days;
//Create a class person with attributes name and age, and print them
public class day_41 {
    public class Person{
        String name;
        int age;
//           constructor
        public Person(String name , int age) {
            this.name=name;
            this.age=age;
        }

        //        method to display info
        public void display(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }
    public void main(String[] args) {
        Person object = new Person("Nisha",20);
        object.display();
    }
}
