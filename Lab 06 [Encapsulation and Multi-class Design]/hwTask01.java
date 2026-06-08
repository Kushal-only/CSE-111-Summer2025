// Task 01
public class Product {
  private String name;
  private double price;
  private int quantity;
  public Product() {
    name = "Unknown";
    price = 0.0;
  }
  public Product(String n,double p) {
    name = n;
    price = p;
  }
  public void setQuantity(int q) {
    quantity = q;
  }
  public String getName() {
    return name;
  }
  public double getPrice() {
    return price;
  }
  public int getQuantity() {
    return quantity;
  }
  public void displayInfo() {
    System.out.println("Product Name: " + getName());
    System.out.println("Price: $" + getPrice());
  }
  public void displayInfo(boolean flag) {
    System.out.println("Product Name: " + getName());
    System.out.println("Price: $" + getPrice());
    System.out.println("Quantity: " + getQuantity());
  }
}
  
  
  
  
  
  
  
  
    