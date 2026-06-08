// Task01
public class Toy {
  String name;
  int price;
  public Toy(String n, int p) {
    name = n;
    price = p;
    System.out.println("A new toy has been made!");
  }
  public void updateName(String n2) {
    System.out.println("Changing old name: " + name);
    name = n2;
    System.out.println("new name: " + name);
  } 
  public void updatePrice(int p2) {
    price = p2;
  }
  public void showPrice() {
    System.out.println(name);
    System.out.println("Price: " + price + " Taka");
  }
}
