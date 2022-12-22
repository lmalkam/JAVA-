class Pen{
    public String brand;
    public String color;
    Pen(String brand,String color)
    {
        this.brand=brand;
        this.color=color;
    }

    public static void main(String[] args)
    {
        Pen[] arr;
        arr = new Pen[2];
        arr[0]=new Pen("Apsara","black");
        arr[1]=new Pen("Nataraj","brown");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at " + i + ":" arr[i].brand + "+" arr[i].color );
        }
    }
}
