package code_challenges_100_days;

//create a class car with methods for starting and stopping the engine.
public class day_44 {
    public static class Car {
        private boolean engineRunning;

        //        constructor
        public Car() {
            this.engineRunning = false;
        }

        //        method to start engine
        public void startEngine() {
            if (!engineRunning) {
                engineRunning = true;
                System.out.println("Engine started.");
            } else {
                System.out.println("Engine is already running ");
            }
        }

        //        method to stop the engine
        public void stopEngine() {
            if (engineRunning) {
                engineRunning = false;
                System.out.println("Engine stopped.");
            } else {
                System.out.println("Engine is already off.");
            }
        }

        //        main method
        public static void main(String[] args) {
            Car obj = new Car();
            obj.startEngine();
            obj.stopEngine();
            obj.stopEngine();
        }
    }
}