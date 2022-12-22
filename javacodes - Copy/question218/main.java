import add.add;
import div.div;
import mul.mul;
import sub.sub;

import java.util.Scanner;

public class main {

    public static void main(String args[])
    {
      int first, second, ch;
      Scanner scanner = new Scanner(System.in);
  
      System.out.print("Enter Two Numbers : ");
      first = scanner.nextInt();
      second = scanner.nextInt();
      System.out.println("Enter the operation");
      System.out.println(" 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
      ch=scanner.nextInt();

      

      switch(ch)
      {
        case 1:
        add a=new add();
        a.add(first,second);
        break;
        case 4:
        div b=new div();
        b.div(first,second);
        break;
        case 2:
        sub c=new sub();
        c.sub(first,second);
        break;
        case 3:
        mul d=new mul();
        d.mul(first,second);
        break;

      }
    }
    
}
