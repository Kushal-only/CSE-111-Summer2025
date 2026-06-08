// Song Class
public class Song {
   String title;
   String artist;
   int length;
   Song next;
   public Song(String t,String a,int l) {
     title = t;
     artist = a;
     length = l;
   }
   public void songInfo() {  
     System.out.println("Title: " + title + ", Artist: " + artist);
     System.out.println("Length: " + length + " minutes");
   }
}
     

            