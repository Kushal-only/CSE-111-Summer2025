import java.util.Scanner;
public class hwTask05 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int [][] array = {{0,0,10,0,-1},{0,-1,0,0,-1},{-1,0,-1,0,0},{0,-1,7,0,0,-1},{0,-1,0,-1,0}};
    System.out.println("Initial Map: ");
    printMap(array);
    int row = array.length, col = array[0].length;
    int row_pos = -1, col_pos = -1;
    for(int i=0;i<array.length;i++) {
      for(int j=0;j<array[0].length;j++) {
        if(array[i][j]==7) {
          row_pos = i;
          col_pos = j;
          break;
        }
      }
    }
    int turns = 5;
    while(turns>0) {
      int new_row = row_pos;
      int new_col = col_pos;
      System.out.printf("Enter move %d:",(6-turns));
      String move = sc.nextLine();
      if(move.equals("RIGHT")) {
        if(new_col+1>col-1) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
        else if(array[new_row][new_col+1]==10) {
          System.out.println("Treasure found. You Win!");
          array[new_row][new_col] = 0;
          new_col++;
          array[new_row][new_col] = 7;
          col_pos = new_col;
          System.out.println("Final State: ");
          printMap(array);
          break;
        }
        else if(array[new_row][new_col+1]==0) {
          array[new_row][new_col] = 0;
          new_col++;
          array[new_row][new_col] = 7;
          col_pos = new_col;
        }
        else if(array[new_row][new_col+1]==-1) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
      }
      else if(move.equals("LEFT")) {
        if(new_col-1<0) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
        else if(array[new_row][new_col-1]==10) {
          System.out.println("treasure found. You Win!");
          array[new_row][new_col] = 0;
          new_col--;
          array[new_row][new_col] = 7;
          col_pos = new_col;
          System.out.println("Finla State:");
          printMap(array);
          break;
        }
        else if(array[new_row][new_col-1]==0) {
          array[new_row][new_col] = 0;
          new_col--;
          array[new_row][new_col] = 7;
          col_pos = new_col;
        }
        else if(array[new_row][new_col-1]==-1) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        } 
      }
      else if(move.equals("DOWN")) {
        if(new_row+1>row-1) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
        else if(array[new_row][new_col]==10) {
          System.out.println("treasure found. You Win!");
          array[new_row][new_col] = 0;
          new_row++;
          array[new_row][new_col] = 7;
          col_pos = new_col;
          System.out.println("Final State:");
          printMap(array);
          break;
        }
        else if(array[new_row+1][new_col]==0) {
          array[new_row][new_col] = 0;
          new_row++;
          array[new_row][new_col] = 7;
          row_pos = new_row;
        }
        else if(array[new_row-1][new_col]==-1) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
      }
      else if(move.equals("UP")) {
        if(new_row-1<0) {
          System.out.println("Player fell outisde the playing area. Game over!");
          break;
        }
        else if(array[new_row-1][new_col]==10) {
          System.out.println("treasure found. You Win!");
          array[new_row][new_col] = 0;
          new_row--;
          array[new_row][new_col] = 7;
          col_pos = new_col;
          System.out.println("Final State:");
          printMap(array);
          break;
        }
        else if(array[new_row-1][new_col]==0) {
          array[new_row][new_col] = 0;
          new_row--;
          array[new_row][new_col] = 7;
          row_pos = new_row;
        }
        else if(array[new_row-1][new_col]==-1) {
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
      }
     System.out.println("Current state:");
      printMap(array);
      turns--;
    }
    if(turns==0) {
      System.out.println("Failed to find the treasure.");
    }
  }
   public static void printMap(int [][] arr) {
     for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+"    ");
      }
      System.out.println();
     }
   }
}
     

       
                                 
          
                
              
    
          
          
          
          
          
          
          
          
          
          
          
        