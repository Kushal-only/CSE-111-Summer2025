// Task 01
class Player {
  static int total;
  static String [] players = new String [11];
  String name;
  int jersey;
  String country;
  public Player(String n,String c,int j) {
    name = n;
    jersey = j;
    country = c;
    players[total] = n;
    total++;
  }
  public String player_detail() {
    System.out.println("Player Name: " + name);
    System.out.println("Jersey Number: " + jersey);
    return "Country: "  + country;    
  }
  public static void info() {
    System.out.println("Total number of players: " + total);
    System.out.print("Players enlisted so far: ");
    for(int i=0;i<total;i++) {
      System.out.print(players[i] + " ");
    }
    System.out.println();
  }
}