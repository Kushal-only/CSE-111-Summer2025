//Task 03
class Cargo { 
  static double capacity = 10.0;
  static int count;
  int id;
  String contents;
  double weight;
  boolean loaded;
  public Cargo(String c,double w) {
    count++;
    contents = c;
    weight = w;
    id = count;
    loaded = false;
  }
  public void load() {
    if(weight<=capacity) {
      capacity -= weight;
      loaded = true;
      System.out.println("Cargo " + id + " loaded for transport");
    }
    else { 
      System.out.println("Cannot load cargo, exceeds weight capacity");
    }
  }
  public void unload() {
    if(loaded==true) {
      loaded = false;
      capacity += weight;
      System.out.println("Cargo " + id + " unloaded");
    }
  }
  public static double capacity() {
    return capacity;
  }
  public void details() {
    System.out.println("Cargo ID: " + id + ", Contents: " + contents);
    System.out.println("Weight: " + weight + ", Loaded: " +loaded);
  }
}