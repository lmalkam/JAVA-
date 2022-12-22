import java.util.Scanner;

public class Sparsematrix {

    public static void main(String[] args) {

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

         int count=0;

         for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                if(twoD[i][j]!=0)
                count++;
            }
         }

         if(count>(rows+columns)/2)
         System.out.println("It is a Sparse matrix");
         else
         System.out.println("It is not a Sparse matrix");
         


    }

}
