public class Q33 {
    public static class OOPS extends Thread {
    public void run() {
    for (int i = 0; i < 8; i++) {
    System.out.println("OOPS");
    try {
    Thread.sleep(2000);
    } catch (InterruptedException e) {
    
    e.printStackTrace();
    }
    }
    }
    }
    public static class JAVA extends Thread {
    public void run() {
    for (int i = 0; i < 8; i++) {
    System.out.println("JAVA");
    try {
    Thread.sleep(2000);
    } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }
    }
    }
    public static void main(String[] args) {
    OOPS t1 = new OOPS();
    JAVA t2 = new JAVA();
    t1.start();
    t2.start();
    }
  

}
