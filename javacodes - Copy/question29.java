import java.util.Scanner;


class clock extends question29
    {
        int hours;
        int minutes;
        int seconds;
        clock(int hours,int minutes,int seconds){
            this.hours=hours;
            this.minutes=minutes;
            this.seconds=seconds;
        }
        clock add(clock c2){
            int n1,n2,n3,carry1=0,carry2=0,finalhour,finalminute,finalsecond;

            if(this.seconds+c2.seconds>=60){
            finalsecond=this.seconds+c2.seconds-60;
            carry1=1;
            }
            else
            finalsecond=this.seconds+c2.seconds;

            if(this.minutes+c2.minutes+carry1>=60){
            finalminute=this.minutes+c2.minutes-60;
            carry2=1;
            }
            else
            finalminute=this.minutes+c2.minutes;


            finalhour=this.hours+c2.hours;

            
            n1=finalhour+carry2;
            n2=finalminute+carry1;
            n3=finalsecond;

            clock c3=new clock(n1,n2,n3);
            return c3;
        }
    }

public class question29 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] clock1 = new int[3];
        int[] clock2=new int[3];

        for (int i = 0; i < 3; i++) 
            clock1[i] = sc.nextInt();

        for (int i = 0; i < 3; i++) 
            clock2[i] = sc.nextInt();

        clock c1=new clock(clock1[0],clock1[1],clock1[2]);
        clock c2=new clock(clock2[0],clock2[1],clock2[2]);

        clock c3= c1.add(c2);

        System.out.println(c3.hours+ " " + c3.minutes + " "+ c3.seconds);

    }
    
}
