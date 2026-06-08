import java.util.Scanner;
public class hwTask03 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: " );
    int x = sc.nextInt();
    int [] array = new int [x];
    for(int i=0;i<array.length;i++) {
      int num = sc.nextInt();
      array[i] = num;
    }
    for(int j=0;j<array.length/2;j++) {
      int temp1 = array[j];
      array[j] = array[x-j-1];
      array[x-j-1] = temp1;
    }
    for(int k=0;k<array.length;k++) {
      System.out.print(array[k] + " ");
    }
  }
}
      