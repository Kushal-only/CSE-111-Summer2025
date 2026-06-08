//Task 04
class CSEStudent extends Student {
  static int total;
  static String [] labCourses = {"CSE110","CSE111","CSE220","CSE221"};
  public CSEStudent(String n,int i) {
    super(n,i);
    total++;
  }
  public void addLabBasedCourse(String n) {
    boolean flag = false;
    for(int i=0;i<labCourses.length;i++) {
      if(n.equals(labCourses[i])) {
        flag = true;
        break;
      } 
    }
    if(courses.equals("")) {
      courses = n;
    }
    else {
      courses += " " + n;
    }
    if(flag==false) {
      System.out.println("It is not a lab based course!");
    }
  }
  public static void details() {
    System.out.println("Totale CSE Students: " + total);
    System.out.println("Available Lab Based Courses:");
    for(int i=0;i<labCourses.length;i++) {
      System.out.print(labCourses[i] + " ");
    }
    System.out.println();
  }
}