import java.io.ObjectInputStream.GetField;

public class a5fifth {
    public static class main1 {
        int i;
        boolean bool = false;

        public synchronized void set(int i) throws InterruptedException {
            while (bool) {
                wait();
            }
            this.i = i;
            bool = true;
            System.out.println("Producer produced : " + i);
            notify();
        }

        public synchronized void get() throws InterruptedException {
            while (!bool) {
                wait();
            }
            // this.i = i;
            bool = false;
            System.out.println("Consumer consumed :" + i);
            notify();
        }
    }

    public static class Consumer implements Runnable {
        private main1 m;

        public Consumer(main1 m) {
            this.m = m;
            Thread consumer = new Thread(this, "Consumer");
            consumer.start();
        }

        @Override
        public void run() {
            // Thread.sleep(1000);
            // TODO Auto-generated method stub
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                try {
                    m.get();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Producer implements Runnable {
        private main1 m;

        public Producer(main1 m) {
            this.m = m;
            Thread producer = new Thread(this, "Producer");
            producer.start();
        }

        @Override
        public void run() {
            int i = 0;
            // TODO Auto-generated method stub
            while (true && i < 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                try {
                    m.set(i++);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        main1 obj = new main1();
        new Consumer(obj);
        new Producer(obj);
    }
}
