package code_challenges_100_days;
//Demonstrate deadlock using two threads and synchronized blocks
public class day_78 {
    static class SharedResource{
        void methodA(SharedResource resourceB){
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"locked Resource A");
                try
                {
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " trying to lock resource B");
                synchronized (resourceB){
                    System.out.println(Thread.currentThread().getName()+ "locked Resource B");
                }
            }
        }
        void  methodB(SharedResource resourceA){
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"locked Resource B");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"trying to lock Resource A");
                synchronized (resourceA){
                    System.out.println(Thread.currentThread().getName()+ " locked Resource A");
                }
            }
        }
    }

    public void main(String[] args) {
        SharedResource resourceA = new SharedResource();
        SharedResource resourceB = new SharedResource();

        Thread thread1 = new Thread(()->resourceA.methodA(resourceB), "Thread-1");
        Thread thread2 = new Thread(()-> resourceB.methodB(resourceA),"Thread-2");
        thread1.start();
        thread2.start();
    }
}
