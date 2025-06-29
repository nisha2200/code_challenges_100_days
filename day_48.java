package code_challenges_100_days;

//Implement an abstract class Shape with subclass Circle and rectangle
public class day_48 {
    abstract class Shape {
        String color;

        //        constructor
        Shape(String color) {
            this.color = color;
        }

        abstract double area();

        abstract void display();
    }

    //    subclass circle
    class Circle extends Shape {
        double radius;

        //        Constructor
        Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        //     overrideing area method
        double area() {
            return Math.PI * radius * radius;
        }
//    overriding display method

        @Override
        void display() {
            System.out.println("Shape: circle");
            System.out.println("color: " + color);
            System.out.println("radius " + radius);
            System.out.println("area: " + area());
        }
    }

    //Rectangle subclass
    class Rectangle extends Shape {
        double length, width;

        //        constructor
        Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        //    overriding area method
        double area() {
            return length * width;
        }

        //      overriding area method
        void display() {
            System.out.println("shape: Rectangle");
            System.out.println("Color: " + color);
            System.out.println("length: " + length);
            System.out.println("width: " + width);
            System.out.println("area: " + area());
        }
    }

    public void main(String[] args) {
        Shape circle = new Circle("red", 50);
        Shape rectangle = new Rectangle("blue", 2, 3);
        circle.display();
        System.out.println();
        rectangle.display();
    }
}
