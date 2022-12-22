import java.security.cert.TrustAnchor;

public class a4fourth {
    public static class Message {
        String msg;
        String msg2;

        Message(String msg) {
            this.msg = msg;
        }

        public String getmsg() {
            return msg;
        }

        public void setmsg(String msg) {
            this.msg2 = msg;
        }
    }

    public static class waitthread implements Runnable {
        private Message m;

        public waitthread(Message m) {
            this.m = m;
        }

@Override
public void run() {
// TODO Auto-generated method stub
String name = Thread.currentThread().getName();
synchronized (m) {
try {
System.out.println(name + " thread waiting to get notified so that
it will wake and execute");
m.wait();
} catch (InterruptedException e) {
// TODO: handle exception
e.printStackTrace();
}
System.out.println("Now the thread got notified it will print its
message :" + m.getmsg());
}
}
    }

    public static class notifythread implements Runnable {
        private Message m;

        public notifythread(Message m) {
            this.m = m;
        }

@Override
public void run() {
// TODO Auto-generated method stub
String name = Thread.currentThread().getName();
System.out.println("Notify thread started : " + name + "it will notify all
the waiting threads after 1s ");
try {
Thread.sleep(1000);
synchronized (m) {
m.setmsg(name + " done its work");
m.notifyAll();
}
} catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
}
    }

public static void main(String[] args) {
Message msg = new Message("this is the message to be printed by wait thread
after it gets notified");
waitthread thread1 = new waitthread(msg);
waitthread thread3 = new waitthread(msg);
new Thread(thread1, "thead1").start();
new Thread(thread3, "thread3").start();
notifythread thread2 = new notifythread(msg);
new Thread(thread2, "thread2").start();
System.out.println("all threads are started");
}
}
