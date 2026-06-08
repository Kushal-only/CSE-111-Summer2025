// Task4
public class Team {
  String name;
  Player [] arr = new Player [11];
  int count;
  public void updateName(String n) {
    name = n;
  }
  public Team(String n) {
    name = n;
  }
  public Team() {
    count = 0;
  }
  public void addPlayer(Player m) {
    if(count<arr.length) {
      arr[count] = m;
      count++;
    }
  }
  public void printDetail() {
    System.out.println("Team: " + name);
    System.out.println("List of players: ");
    for(int i=0;i<count;i++) {
      arr[i].printDetail();
    }
  }
}

