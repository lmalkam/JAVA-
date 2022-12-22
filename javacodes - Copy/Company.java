import java.util.Scanner;

class one extends Company {

    public int dispMin(Employee[] A)
    {
        int min=99999999;
        for(int i=0;i<5;i++)
        {
            if(min>A[i].salary)
            min=A[i].salary;
        }
        return min;
    }

    public int dispMax(Employee[] A)
    {
        int max=0;
        for(int i=0;i<5;i++)
        {
            if(max<A[i].salary)
            max=A[i].salary;
        }
        return max;
    }

}

class two extends Company{

    public int AvgSalary(Employee[] A)
    {
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=A[i].salary;
        }
        sum/=5;
        return sum;
    }

    public int difference(int a,int b)
    {
        int result=b-a;
        return result;
    }
}


public class Company {
    
    public class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public void adder(Employee[] A,int[] salaries, String[] names)
    {
        for(int i=0;i<5;i++)
        {
            A[i] = new Employee(names[i], salaries[i]);
        }
    }

    public static void main(String[] args) {

        Employee[] A;
        A = new Employee[5];

        Scanner sc = new Scanner(System.in);
        int[] salaries = new int[5];
        String[] names=new String[5];

        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
            salaries[i] = sc.nextInt();
        }

        Company Add=new Company();

        Add.adder(A,salaries,names);

        one result1=new one();

        System.out.println("Minimum salary is : " + result1.dispMin(A) );
        System.out.println("Maximum salary is : " + result1.dispMax(A) );

        two result2= new two();

        System.out.println("Average salary is : " + result2.AvgSalary(A) );
        System.out.println("Difference salary is : " + result2.difference(result1.dispMin(A),result1.dispMax(A)) );

    }
}

