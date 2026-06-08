import java.util.Scanner;
public class hwTask01 { 
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int count = 0;
    for(int i=start;i<=end;i++) {
      boolean flag = false;
      for(int j=2;j<i;j++) {
        if(i%j==0) {
          flag = true;
          break;
        }
      }
      if(flag==false) {
        count++;
      }
    }
    System.out.print("There are " + count + " prime number beetween " + start + " and " + end);
  }
}
        
        