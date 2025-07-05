package code_challenges_100_days;

//Create a thread by implementing the Runnable interface
public class day_72 {
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
//        code that runs in the thread
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - count " + i);
                try {
                    Thread.sleep(500); // sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e);
                }
            }
        }
    }

    public void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
//        creating threads and passing runnable object
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

//        starting the threads
        thread1.start();
        thread2.start();
    }
}
