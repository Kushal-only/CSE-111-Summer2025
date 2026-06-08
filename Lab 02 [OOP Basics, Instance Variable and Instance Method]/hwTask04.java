// Task04
public class Employee {
  String name;
  double salary = 30000;
  String designation = "junior";
  public void newEmployee(String p) {
    name = p;
  }
  public void displayInfo() {
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + designation);
  }
  public void calculateTax() {
    if(this.salary>50000) {
      System.out.println(name + " Tax Amount: " + salary*30/100 + " Tk");
    }
    else {
      System.out.println("No need to pay tax");
    }
  }
  public void promoteEmployee(String s) {
    if(s.equals("lead")) {
      designation = s;
      salary += 50000;
      System.out.println(name + " has been promoted to " + s);
      System.out.println("New salary: "+ salary);
    }
    else if(s.equals("senior")) {
      designation = s;
      salary += 25000;
      System.out.println(name + " has been promoted to " + s);
      System.out.println("New salary: "+ salary + "Tk");
  }
    else if(s.equals("manager")) {
      designation = s;
      salary += 75000;
      System.out.println(name + " has been promoted to " + s);
      System.out.println("New salary: "+ salary + " Tk");
    }
  }
}
  
  