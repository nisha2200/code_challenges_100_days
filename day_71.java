package code_challenges_100_days;

//Create a thread by extending the Thread class.
public class day_71 {
    static class MyThread extends Thread {
        public void run() {
//            code that will run in the thread
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Running: " + i);
                try {
                    Thread.sleep(500); //sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted ");
                }
            }
        }
    }

    public void main(String[] args) {
//        create an object of MyThread
        MyThread thread = new MyThread();
//        start the thread
        thread.start();
//        main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);
            try {
                Thread.sleep(500); //sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
    }
}