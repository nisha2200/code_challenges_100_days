package code_challenges_100_days;

//Implement an inheritance class Vehicle and its classes Bike and Car
public class day_49 {
    static class Vehicle {
        String brand;
        int speed;

        //        constructor
        Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        //        method to display vehicle details
        void displayInfo() {
            System.out.println("brand:" + brand);
            System.out.println("speed: " + speed + " km/h");
        }
    }

    static class Bike extends Vehicle {
        boolean hasHelmet;

        Bike(String brand, int speed, boolean hasHelmet) {
            super(brand, speed);
            this.hasHelmet = hasHelmet;
        }
//        overriding displayinfo method

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("helmet provided: " + (hasHelmet ? "yes" : "no"));
        }
    }

    //    subclass car
    static class Car extends Vehicle {
        int numberofDoors;

        //        constructor
        Car(String brand, int speed, int numberofDoors) {
            super(brand, speed);
            this.numberofDoors = numberofDoors;
        }

    }

    //main class
    public void main(String[] args) {
        Bike mybike = new Bike("honda", 50, true);
        Car myCar = new Car("benz", 120, 4);
        System.out.println("bike ingo:");
        mybike.displayInfo();
        System.out.println("car info :");
        myCar.displayInfo();
    }
}