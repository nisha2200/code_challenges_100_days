package code_challenges_100_days;
//Demonstrate use of sleep() method in a thread
public class day_73 {
    static class MyThread extends Thread{
        public MyThread() {
        }

        public void run(){
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -count "+i);
                try {
//                    pause the thread for 1000 milliseconds
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("thread interrupted: "+e);
                }
            }
        }
    }
    public void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();
    }
}
