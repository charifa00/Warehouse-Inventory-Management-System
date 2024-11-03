package Inventory;


public class Product  {
    public static Integer id;
    public String name;
    public double price;
    public int quantity;

//constructors


    public Product(Integer id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }
    //Getters and setters
    public static Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayInfo(){
        System.out.println("product name :"+getName());
        System.out.println("product price:"+getPrice());
        System.out.println("product quantity :"+getQuantity());
    }
     public void updateQuantity(int newQuantity){
         quantity=newQuantity;
     }
    public void updateQuantity(int addedQuantity, boolean addToExisting){
        quantity=+addedQuantity;
    }

    public static void welcomeMessage(){
        System.out.println("Welcome to our inventory system.");
    }


}
