package code_challenges_100_days;

//Create an employee class with inheritance for manager and developer
public class day_47 {
    static class Employee {
        String name;
        int id;
        double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("id: " + id);
            System.out.println("salary: " + salary);
        }
    }

    static class Manager extends Employee {
        String department;

        public Manager(String name, int id, double salary, String department) {
            super(name, id, salary);
            this.department = department;
        }

        public void displayManagerInfo() {
            displayInfo();
            System.out.println("Department: " + department);
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;

        public Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        public void displayDeveloperInfo() {
            displayInfo();
            System.out.println("Programming Lnaguage: " + programmingLanguage);
        }
    }

    public static class Company {
        public static void main(String[] args) {
            Manager manager = new Manager("alice", 11, 290000, "HR");
            Developer developer = new Developer(" bob", 456, 234500, "java");
            System.out.println("manager details: ");
            manager.displayManagerInfo();
            System.out.println("developer details: ");
            developer.displayDeveloperInfo();
        }
    }
}