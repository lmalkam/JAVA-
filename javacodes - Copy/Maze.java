public class Maze {

    static int[][] arr={{0,0,0,0},
                        {0,1,0,0},
                        {0,1,1,1},
                        {0,0,0,0}};

    static int[][] b={{0,0,0,0},
                       {0,0,0,0},
                    {0,0,0,0},
                {0,0,0,0}};


    static void maze(int i,int j,int x,int y)
    {

        if(i==x && j==y)
        {
            System.out.println("("+i+" "+j+")");
            return;
        }



        if(i<0 || j<0 || i>x || j>y )
        return;

        if(arr[i][j]==1 || b[i][j]==1)
        return;


        System.out.print("("+i+","+j +")"+ "->");
        b[i][j]=1;

        maze(i+1,j,x,y);
        maze(i,j+1,x,y);
        maze(i-1,j,x,y);
        maze(i,j-1,x,y);
        
    }


    public static void main(String[] args) {

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
       maze(0,0,3,3);
        

    }
    
}
