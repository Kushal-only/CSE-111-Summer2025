// Task03
public class Assignment {
  int tasks;
  String difficulty;
  boolean submission;
  int count;
  public void printDetails() {
    System.out.println("Number of tasks: " + tasks);
    System.out.println("Difficulty level: " + difficulty);
    System.out.println("Submission required: " + submission);
  }
  public String makeOptional() {
    if(submission == true) {
      String s = "Assignment will not require submission";
      return s;
    }
    else {
      String s2 = "Submission is already not required";
      return s2;
    }
  }
}
    


    
 
    



    

    