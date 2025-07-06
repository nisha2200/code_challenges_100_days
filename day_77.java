package code_challenges_100_days;
//Create a synchronized method for thread-safe operation
public class day_77 {
    static class Counter{
        private int count = 0;
//        synchronized method to make it
        public synchronized void increment(){
            count++;
        }
        public int getCount(){
            return count;
        }
    }
    static class CounterThread extends  Thread{
        private  Counter counter;
        public CounterThread(Counter counter){
            this.counter = counter;
        }
        public void  run(){
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // Thread-safe operation
            }
        }
    }

    public void main(String[] args) {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Count: "+ counter.getCount());
    }
}
