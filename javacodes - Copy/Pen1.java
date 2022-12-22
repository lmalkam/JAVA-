public class Pen1{
    public String brand;
    public String color;
    Pen1(String brand,String color)
    {
        this.brand=brand;
        this.color=color;
    }

    public static void main(String[] args)
    {
        Pen1[] arr;
        arr = new Pen1[2];
        arr[0]=new Pen1("Apsara","black");
        arr[1]=new Pen1("Nataraj","brown");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at " + i + ":" +  arr[i].brand + "+" + arr[i].color );
        }
    }
}

