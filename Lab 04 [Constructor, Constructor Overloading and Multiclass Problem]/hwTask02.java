//Task 2
public class Student {
  String [] course = new String [4];
  int id;
  double cgpa;
  int count;
  public Student(int n) {
    id = n;
    System.out.println("A student with ID " + id + " has been created.");
  }
  public Student(int n2, double c) {
    id = n2;
    cgpa = c;
    System.out.println("A student with ID " + id + " and " + " CGPA: " + cgpa + " has been created.");
  }
  public void storeCG(double c2) {
    cgpa = c2;
  }
  public void storeID(int n) {
    id = n;
  }
  public void addCourse(String c) {
    if(cgpa==0.0) {
      System.out.println("Failed to add " + c );
      System.out.println("Set CG first");
    }
    else if(cgpa>=3.0 && count<=4) {
      course[count] = c;
      count++;
    }
    else if(cgpa<3.0) {
      if(count<3) {
        course[count] = c;
        count++;
      }
      else {
        System.out.println("Failed to add " + c);
        System.out.println("CG is low. Can't add more than 3 courses.");
      }
    }
  }
  public void addCourse(String [] arr) {
    int p = arr.length;
    if(course.length>=p) {
      for(int i=0;i<p;i++) {
        course[i] = arr[i];
      }
      count++;
    }
    else {
      p--;
      System.out.println("Failed to add " + arr[p]);
      System.out.println("Maximum 4 courses allowed.");
      for(int i=0;i<p;i++) {
        course[i] = arr[i];
      }
      count = 4;
    }
  }
  public void removeAllCourse() {
    course[0] = null;
  }
  public void showAdvisee() {
    System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
    if(course[0] != null) {
      System.out.println("Added courses are: ");
      for(int i=0;i<count;i++) {
        System.out.print(course[i] + " ");
      }
      System.out.println();
    }
  }
}

    
      