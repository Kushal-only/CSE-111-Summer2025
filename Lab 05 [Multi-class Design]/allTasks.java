// Playlist Class
public class Playlist {
  String name;
  Song start;

  public Playlist(String p) {
    name = p;
    System.out.println(name + " created");
  }
  public void info() {
    System.out.println(name + " has the following songs: " );
    if(start == null) {
      System.out.println("No songs in " + name);
      return;
    } 
      int count = 1;
      for(Song i =start; i!=null;i=i.next) {
        System.out.println("Song " + count);
        count++;
        i.songInfo();
    }
  }
  public void addSong(Song a) {
    Song r = start;
    System.out.println(a.title + " added to " + name);
    if(r!=null) {
      while(r.next!=null) {
        r=r.next;
      }
      r.next = a;
    }
    else {
      start = a;
    }
  }   
  public void addSong(Song b, boolean x) {
    if(x==false) {
      addSong(b);
    }
    else {
      b.next = start;
      start = b;
    }
  }
  public void playSong(String c) {
    boolean flag = false;
    for(Song i =start; i!=null;i=i.next) {
      if(i.title.equals(c)) {
        System.out.println("Playing " + c + " by " + i.artist);
        flag = true;
      }
    }
    if(flag==false) {
      System.out.println(c + " not found in " + name);
    }
  }
  public void playSong(int p) {
    boolean flag = false;
    Song i = start;
    int n = 0;
    while(i.next!=null) {
      if(n==p) {
        flag = true;
        break;
      }
      else {
        n++;
        i=i.next;
      }
    }
    if(flag==true) {
      System.out.println("Playing " + i.title + " by " + i.artist);
    }
    else {
      System.out.println("Song at Index " + p + " not found in " + name);
    }
  }
  public void deleteSong() {
    for(Song d=start;d.next!=null;d=d.next) {
      if(d.next.next==null) { 
      System.out.println(d.title + " deleted from " + name);
      d.next=null;
      break;
      }
    }
  }
  public void deleteSong(boolean s) {
    if(s==true) {
      start = start.next;
      System.out.println("First Song Deleted!");
    }
    else {
      deleteSong();
    }
  }
  
  public int totalSong() {
    int t = 0;
      for(Song i =start; i!=null;i=i.next) {
        t++;
      }
      return t;
  }
  public void merge(Playlist p) {
    int s = p.totalSong();
    Song v = start;
    while(v.next!=null) {
      v = v.next;
    }
    v.next = p.start;
    System.out.println("Merge Completetd!");
  }
}
                        

      
     

      
    
    


        
    

     
      
  