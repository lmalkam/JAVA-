public class Question217
{
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) 
    {    
        Question217 obj = new Question217();
        System.out.println("Sum  "+obj.add(10, 40));
        System.out.println("Sum " +obj.add(10, 90, 30));
        System.out.println("Sum  "+obj.add(1,  2, 3, 4));
    }
}