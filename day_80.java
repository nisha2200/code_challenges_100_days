package code_challenges_100_days;
//Use ThreadGroup to handle a group of threads.
public class day_80 {
    static class MyTask extends Thread{
        public MyTask(ThreadGroup group, String name){
            super(group,name);
        }
        public void run(){
            System.out.println("Thread "+ getName()+ " is running.");
            try{
                Thread.sleep(1000); //simulate task
            }catch (InterruptedException e){
                System.out.println(getName()+" interrupted. ");
            }
            System.out.println("Thread "+ getName() + " finished.");
        }

    }
    public void main(String[] args) {
//        create a ThreadGroup
        ThreadGroup group = new ThreadGroup("MyThreadGroup");
//        create multiple threads in this group
        MyTask t1 = new MyTask(group, "Thread-1");
        MyTask t2 = new MyTask(group, "Thread-2");
        MyTask t3 = new MyTask(group, "Thread-3");

//        start all threads
        t1.start();
        t2.start();
        t3.start();
//        Display ThreadGroup Information
        System.out.println("Active Threads: "+group.activeCount());
        group.list(); //prints details of all threads in the group

//        wait for threads to finish
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads finished. ");
    }
}
