import java.util.Scanner;
public class hwTask02 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String c = "";
    for(int i=0;i<n.length();i++) {
      char ch = n.charAt(i);
      char pre;
      if(ch=='a'){
        pre = 'z';
      }
      else {
      pre = (char)(ch-1);
      }
      c+=pre;
    }
    System.out.println(c);
  }
}
      
                      