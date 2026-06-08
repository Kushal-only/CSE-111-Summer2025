// Task 03
class Student {
  public String name;
  private int id;
  public double cg;
  public Student(String n,int i,double c) {
    name = n;
    cg = c;
    id = i;
  }
  public void setId(int x) {
    id = x;
  }
  public int getId() {
    return id;
  }
  public String info() {
    return "Student name: " + name + ", ID: " + id + ", cgpa: " + cg;
  }
  public String info2() {
    System.out.println("Student info: ");
    System.out.println("Name: " + name);
    System.out.println("ID: " + getId());
    System.out.println("CGPA: " + cg);
    return "";
  }
}
class Department {
  public String dName;
  public int count;
  public Student [] st = new Student[5];
  public Department(String n) {
    dName = n;
  }
  public void addStudent(Student v) {
    boolean flag = false;
    for(int i=0;i<count;i++) {
      if(st[i].getId()==v.getId()) {
        flag = true;
        break;
      }
    }
    if(flag==true) {
      System.out.println("Student withe the same ID already exists.Please try with another ID");
    }
    else {
      st[count++] = v;
      System.out.println("Welcome to " + dName + " department, " + v.name);
    }
  }
  public void addStudent(Student a,Student b,Student c) {
    addStudent(a);
    addStudent(b);
    addStudent(c);
  }
  public void findStudent(int n) {
    boolean flag = false;
    for(int i=0;i<count;i++) {
      if(st[i].getId()==n) {
        flag = true;
        System.out.println("Student info: ");
        System.out.println("Name: " + st[i].name);
        System.out.println("ID: " + st[i].getId());
        System.out.println("CGPA: " + st[i].cg);
        break;
      }
    }
    if(flag==false) {
      System.out.println("Student with this ID doesn't exist, Please give a valid ID");
    }
  }
  public void details() {
    System.out.println("Department Name: " + dName);
    System.out.println("Number of student: " + count);
    System.out.println("Details of the students: ");
    for(int i=0;i<count;i++) {
      System.out.println(st[i].info());
    }
  }
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    