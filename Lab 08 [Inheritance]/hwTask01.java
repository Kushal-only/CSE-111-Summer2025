//Task 01
class Dog extends Animal { 
  String name ;
  public String getName() {
    return name;
  }
  public Dog() {
    System.out.println("The dog says hello!");
  }
  public void updateSound(String b) {
    sound = b;
  }
}