import java.util.Hashtable;
import java.util.ArrayList;
class CombatDeck extends Deck implements Comparable<Deck> {
   protected String category;
   protected Hashtable<String, Asset> assets;
  public CombatDeck(String category)  {
      super(category);
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
