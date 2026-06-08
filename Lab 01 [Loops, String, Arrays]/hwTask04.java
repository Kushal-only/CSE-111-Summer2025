import java.util.Scanner;
public class hwTask04 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int [] array = new int [x];
    for(int i=0;i<array.length;i++) {
      int num = sc.nextInt();
      array[i] = num;
    }
    for(int j=0;j<array.length;j++) {
      boolean flag = false;
      for(int k=0;k<j;k++) {
        if(array[j]==array[k]) {
          flag = true;
          break;
        }
      }
      if(flag==true) {
        int count1 = 0;
        for(int l=0;l<array.length;l++) {
          if(array[j]==array[l]) {
            count1++;
          }
        }
        System.out.println(array[j] + " - " + count1 + " times ");
      }
    }
  }
}