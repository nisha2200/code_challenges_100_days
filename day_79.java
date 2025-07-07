package code_challenges_100_days;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Use executorService to manage multiple threads.
public class day_79 {
    static class MyTask implements Runnable{
        private final String taskName;
        public MyTask (String taskName){
            this.taskName = taskName;
        }
        public  void  run(){
            System.out.println("Task "+taskName+" is running on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);  //Simulate some work
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Task "+ taskName +" completed by "+Thread.currentThread().getName());
        }
    }
    public void main(String[] args) {
//        create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
//        submit 5 tasks to the executor
        for (int i = 1; i <=5 ; i++) {
            MyTask task = new MyTask("Task-" + i);
            executor.submit(task);
        }
//        shutdown the executor
        executor.shutdown();
        System.out.println("All tasks submitted.");
    }
}
