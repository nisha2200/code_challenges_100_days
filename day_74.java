package code_challenges_100_days;
//Create two threads and demonstrate thread execution using join()
public class day_74 {
    class MyThread extends Thread{
        private String threadName;
        MyThread(String name){
            this.threadName = name;
        }
        public void run(){
//            code to be executed by thread
            for (int i = 1; i <=5 ; i++) {
                System.out.println(threadName + "- count "+i);
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted "+e);
                }
            }
        }
    }

    public static void main(String[] args) {
        day_73.MyThread thread1 = new day_73.MyThread();
        day_73.MyThread thread2 = new day_73.MyThread();
        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted: "+e);
        }
//        start the second thread after thread1 completes
        thread2.start();
        try{
//            wait for thread2 to finish before ending main thread
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted :"+e);
        }
        System.out.println("Main thread ends after both threads finish.");
    }
}
