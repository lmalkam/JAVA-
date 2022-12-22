import java.util.Scanner;
public class Question5 {

    public static void spiral(int[][] a,int rows,int columns)
    {

        int rowstart=0,colstart=0,rowend=rows-1,colend=columns-1;

        while(colstart<=colend)
        {
            for(int i=rowstart;i<=rowend;i++)
            System.out.print(a[colstart][i] + " ");

            colstart++;

            for(int i=colstart;i<=colend;i++)
            System.out.print(a[i][rowend] + " ");

            rowend--;

            for(int i=rowend;i>=rowstart;i--)
            System.out.print(a[colend][i] + " ");

            colend--;

            for(int i=colend;i>=colstart;i--)
            System.out.print(a[i][rowstart] + " ");

            rowstart++;
        }

    }

    public static void main(String[] args)
    {
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }

         spiral(twoD,rows,columns);
    }
    
}
