interface Vehicle 
{
    void changeGear(int a);
    void increasespeed(int a);
    void Brakes(int a);
}

class Bicycle implements Vehicle
{
    
    int speed;
    int gear;
    
    public void changeGear(int newGear)
    {
        gear = newGear;
    }
    
    public void increasespeed(int increment)
    {
        
        speed = speed + increment;
    }
    
    public void Brakes(int decrement)
    {
        
        speed = speed - decrement;
    }
    
    void printStates() {
    System.out.println("speed: " + speed+ " gear: " + gear);
    }
    
}

class Bike implements Vehicle 
{
    
    int speed;
    int gear;
    
    public void changeGear(int newGear)
    {
        
        gear = newGear;
    }
    
    public void increasespeed(int increment)
    {
        
        speed = speed + increment;
    }
    
    public void Brakes(int decrement)
    {
        
        speed = speed - decrement;
    }
    
    public void printStates()
    {
    System.out.println("speed: " + speed + " gear: " + gear);
    }
    
}
class Question208 {
    
    public static void main (String[] args) 
    {
    
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.increasespeed(3);
        bicycle.Brakes(1);
        
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.increasespeed(4);
        bike.Brakes(3);
        
        System.out.println("Bike present state :");
        bike.printStates();
    }
} 
    
