
public class Matrix{
    public static int sum(int[][] twod){
        int sum=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==j)
                sum+=twod[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] twod = new int[10][10];
        int k=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==j)
                twod[i][j]=k++;
            }
        }

        System.out.println("The program should return the sum of diagonal values : " + sum(twod));
    }
    
}
