import java.util.Hashtable;
import java.util.ArrayList;
class PathDeck extends ArrayList implements Comparable<Deck> {
   protected String category;
   protected Hashtable<String, Asset> assets;
  public PathDeck(String category)  {
     this.category = category;
     assets = new Hashtable<String, Asset>();
  }

  public boolean equals(Deck d){
      if(d.category.equalsIgnoreCase(this.category)){
        return true;
      }
      return false;
  }

   public int compareTo(Deck d){
       return this.category.compareTo(d.category);
   }

   public void add(Asset a){
     assets.put(a.getName(), a);
   }
}  
