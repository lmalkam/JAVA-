import java.util.*;
public class Q39 {
    public static class NegativeNumberException extends Exception {
        NegativeNumberException(String message) {
            super(message);
        }
    }

    public static class PositiveNumberException extends Exception {
        PositiveNumberException(String message) {
            super(message);
        }
    }

    public static class ZeroNumberException extends Exception {
        ZeroNumberException(String message) {
            super(message);
        }
    }

    public static class testestexception {
        int n;

        testestexception(int n) {
            this.n = n;
        }

public void check() throws Exception {
if (n < 0) {
throw new NegativeNumberException("Exception occurred number is negative");
} else if (n == 0) {
throw new ZeroNumberException("Exception occuurred number is zero");
} else {
throw new PositiveNumberException("Excepton occurred number ispositive");
}
}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 3;
        while (i != 0) {
            System.out.println("Enter a number to check exception");
            int n = sc.nextInt();
            testestexception obj = new testestexception(n);
            try {
                obj.check();
            } catch (Exception e) {
                System.out.println("Exception caught");
                e.printStackTrace();
                // TODO: handle exception
            }
            i--;
        }
    }
}