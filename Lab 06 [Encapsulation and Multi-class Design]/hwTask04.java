// Task 04
class Cargo {
  private String name;
  private int weight;
  public Cargo(String n,int w) {
    name = n;
    weight = w;
  }
  public int getWeight() {
    return weight;
  }
  public String getName() {
    return name;
  }
}
class Spaceship {
  public String name;
  public int capacity;
  public int count;
  public int cWeight;
  public Cargo [] c = new Cargo[100];
  public Spaceship(String n,int w) {
    name = n;
    capacity = w;
  }
  public void loadCargo(Cargo v) {
    if(cWeight+v.getWeight()>capacity) {
      System.out.println("Warning: Unable to load " + v.getName() + " inside " + this.name + ". Exceeds capacity by " + ((cWeight+v.getWeight())-capacity));
    }
    else {
      c[count++] = v;
      cWeight+=v.getWeight();
    }
  }
  public void displayDetails() {
    System.out.println("Spaceship name: " + name);
    System.out.println("Capacity: " + capacity);
    System.out.println("Currrent cargo weight: " + cWeight);
    System.out.println("Cargo:");
    for(int i=0;i<count;i++) {
      System.out.print(c[i].getName() + " ");
    }
  }
}
      
  
  
  
  
  
  