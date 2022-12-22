class Car{
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
    void editquantity()
    {
        quantity--;
    }

    String toostring(){
        return "Model : "+getmodel() + " Brand : "+getbrand() +" Year : "+getyear() + " Price :"+ getprice() + " Color : " + getcolor() + " Quantity : "+ getquantity();
    }

    void sell()
    {
        editquantity();
    }
}

class Supercar{
    public static void main(String[] args) {
        Car C=new Car("Model S","Tesla",2021,94990,"White",51);
        System.out.println(C.toostring());
        C.sell();
        System.out.println(C.toostring());
        C.editprice(110000);
        System.out.println(C.toostring());
    }
}
