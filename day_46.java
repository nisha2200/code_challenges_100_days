package code_challenges_100_days;

//Implement method overriding in an animal and dog class

public class day_46 {
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound ");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks.");
        }

        public static void main(String[] args) {
            Animal object = new Animal();
            Animal object1 = new Dog();
            object.sound();
            object1.sound();
        }
    }
}
