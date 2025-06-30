package code_challenges_100_days;
//Demonstrate the use of super and this keyword in java
public class day_50 {
    static class Animal{
        String color;
        Animal(){
            System.out.println("Animal constructor called:");
        }
        void displayColor(){
            System.out.println("Animal color: "+color);
        }
    }
//    child class
static class Dog extends Animal{
        String color = "black";
        Dog(){
            super();
            System.out.println("dog constructor called");
        }
        void showColor(){
            System.out.println("Dog color (child class)"+ super.color);
            System.out.println("Animal color (parent class): "+super.color);
        }
void callMethods(){
        this.showColor();
        super.displayColor();
}
}
    public void main(String[] args) {
        Dog mydog = new Dog();
        mydog.callMethods();
    }
}
