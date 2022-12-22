private class Car{
    String model;
    String brand;
    int year;
    int price;
    String color;
    int quantity;
    Car(String model,String brand,int year,int price, String color, int quantity){
        this.model=model;
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.quantity=quantity;
    }
    String getmodel(){
        return model;
    }
    String getbrand(){
        return brand;
    }
    int getyear(){
        return year;
    }
    int getprice(){
        return price;
    }
    String getcolor(){
        return color;
    }
    int getquantity(){
        return quantity;
    }
    void editmodel(String model){
        this.model=model;
    }
    void editbrand(String brand){
        this.brand=brand;
    }
    void edityear(int year){
        this.year=year;
    }
    void editprice(int price){
        this.price=price;
    }
    void editquantity(int quantity)
    {
        this.quantity=quantity;
    }
}

class Supercar{
    public static void main() {

        
        
    }
}
