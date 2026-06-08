//Task4
public class Player {
  int age;
  String playerName;
  int total;
  public Player(String pn, int a, int t) {
    playerName = pn;
    age = a;
    total = t;
  }
  public void printDetail() {
    System.out.println("Name: " + playerName);
    System.out.println("Age: " + age + ", Total matches: " + total);
  }
}
    