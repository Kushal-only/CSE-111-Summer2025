// Task02
class Travel {
  private static int count;
  private String source;
  private String des;
  private int time;
  public static int getCount() {
    return count;
  }
  public String getSource() {
    return source;
  }
  public String getDes() {
    return des;
  }
  public int getTime() {
    return time;
  }
  public Travel(String s,String d) {
    source = s;
    des = d;
    count++;
  }
  public void setTime(int t) {
    time = t;
  }
  public void setSource(String s) {
    source = s;
  }
  public void setDestination(String d) {
    des = d;
  }
  public String displayTravelInfo() {
    System.out.println("Source: " + getSource());
    System.out.println("Destination: " + getDes());
    return "Flight Time: " + getTime() + ":00";
  }
}