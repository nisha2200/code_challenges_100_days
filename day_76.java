package code_challenges_100_days;

//Implement a producer - consumer example using wait and notify.
public class day_76 {
    static class SharedBuffer {
        private int item;
        private boolean hasItem = false;

        public synchronized void product(int value) {
            while (hasItem) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            item = value;
            hasItem = true;
            System.out.println("produced: " + item);
            notify();
        }

        //    consumer method
        public synchronized void consume() {
            while (!hasItem) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Consumed: " + item);
            hasItem = false;
            notify();
        }

        static class Producer extends Thread {
            private final SharedBuffer buffer;

            public Producer(SharedBuffer buffer) {
                this.buffer = buffer;
            }

            public void run() {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private void produce(int i) {
        }

        static class Consumer extends Thread {
            private SharedBuffer buffer;

            public <SharedBuffer> Consumer(SharedBuffer buffer) {
                this.buffer = (day_76.SharedBuffer) buffer;
            }

            public void run() {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void main(String[] args) {
            SharedBuffer buffer = new SharedBuffer();
            Producer producer = new Producer(buffer);
            Consumer consumer = new Consumer(buffer);
            producer.start();
            consumer.start();
        }
    }
}