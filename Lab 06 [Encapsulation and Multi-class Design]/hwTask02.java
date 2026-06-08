// Task 02
class Employee {
  private String name;
  private int id;
  private String type;
  public Employee() {
    System.out.println("A default employee has been created");
  }
  public Employee(String n,int i,String t) {
    setName(n);
    setId(i);
    setType(t);
  }
  public void setName(String n) {
    name = n;
  }
  public void setId(int i) {
    id = i;
  }
  public void setType(String t) {
    type = t;
  }
  public String getName() {
    return name;
  }
  public int getId() {
    return id;
  }
  public String getType() {
    return type;
  }
  public String info() {
    return "Name: " + getName() + ", Id: " + getId();
  }
}
class Company {
  private String companyName;
  private int count;
  private Employee [] names = new Employee [3];
  public void addEmployee(Employee e) {
    if(count<3) {
    names[count] = e;
    count++;
    System.out.println(e.getName() + " has joined the company");
    }
    else {
      System.out.println("No more vacancy");
    }
  }
  public Company() {
    setCompanyName();
  }
  public void setCompanyName() {
    companyName = "ABC Company";
  }
  public String getCompanyName() {
    return companyName;
  }
  public int getCount() {
    return count;
  }
  public void setCount() {
    count = 0;
  }
  public void removeEmployee(Employee f) {
    for(int i=0;i<count;i++) {
      if(names[i]==f) {
        names[i] = null;
        count--;
        System.out.println(f.getName() + " has left the company");
      }
    }
  }
  public void details() {
    System.out.println("Company Name: " + getCompanyName());
    System.out.println("Total Employee: " + getCount());
    System.out.println("Fulltime Employees: ");
    for(int i=0;i<count;i++) {
      if(names[i].getType()=="Fulltime") {
        System.out.println(names[i].info());
      }
    }
    System.out.println("Part-Time Employees: ");
    for(int i=0;i<count;i++) {
      if(names[i].getType()=="Part-time") {
        System.out.println(names[i].info());
      }
    }
  }
}
        
       
    
      
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  