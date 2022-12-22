public class Q311 {
    public static class MyException extends Exception {
    String str;
    MyException(String str) {
    this.str = str;
    }
    public void check() throws MyException {
    throw new MyException(str);
    }
    }
    public static void main(String[] args) {
    MyException obj = new MyException("Created my own exception");
    try {
    obj.check();
    } catch (Exception e) {
    System.out.println("Exception occurred");
    e.printStackTrace();
    }
    }
    }
    