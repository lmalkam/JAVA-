import java.util.*;

public class Q37 {
    static class NotValidOxygenException extends Exception {
        NotValidOxygenException(String str) {
            super(str);
        }
    }

    static class Below70Exception extends Exception {
        Below70Exception(String str) {
            super(str);
        }
    }

public static void main(String[] args) throws
Q37.NotValidOxygenException, Q37.Below70Exception {
Scanner sc = new Scanner(System.in);
int j = 0;
while (j < 4) {
ArrayList<Integer> list = new ArrayList<>();
System.out.println("Enter values for the first round ");
for (int i = 0; i < 3; i++) {
int n = sc.nextInt();
if (n < 1 || n > 100) {
throw new NotValidOxygenException("not valid");
}
list.add(n);
}
ArrayList<Integer> list1 = new ArrayList<>();
System.out.println("Enter values for the second round");
for (int i = 0; i < 3; i++) {
int n = sc.nextInt();
if (n < 1 || n > 100) {
throw new NotValidOxygenException("not valid");
}
list1.add(n);
}
ArrayList<Integer> list2 = new ArrayList<>();
System.out.println("Enter values for the third round");
for (int i = 0; i < 3; i++) {
int n = sc.nextInt();
if (n < 1 || n > 100) {
throw new NotValidOxygenException("not valid");
}
list2.add(n);
}
int avg1 = (list.get(0) + list1.get(0) + list2.get(0)) / 3;
System.out.println("for first trainee the average is :" + avg1);
int avg2 = (list.get(1) + list1.get(1) + list2.get(1)) / 3;
System.out.println("for second trainee the average is :" + avg2);
int avg3 = (list.get(2) + list1.get(2) + list2.get(2)) / 3;
System.out.println("for third trainee the average is :" + avg3);
int a = Math.max(avg1, avg2);
int b = Math.max(a, avg3);
if (b < 70) {
throw new Below70Exception("all trainees are unfit");
}
if (avg1 == avg2 && avg2 == avg3) {
System.out.println("all the trainees are equall fit with average
o-level as : " + avg1);
} else if (avg2 == avg1) {
System.out.println("first and second trainee are most fit with o
level :" + avg2);
} else if (a == avg3) {
if (avg1 > avg2) {
System.out.println("first and third trainee are equally fit"
+ avg1);
} else {
System.out.println("second and third tranee are equall fit
with o lever :" + avg2);
}
} else {
if (b == avg1) {
System.out.println("first trainee is most fit with o level:"
+ avg1);
} else if (b == avg2) {
System.out.println("second trainee is most fit with o level
" + avg2);
} else {
System.out.println("third trainee is most fit with o level "
+ avg3);
}
}
System.out.println();
j++;
}
}
}