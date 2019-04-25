import java.util.Hashtable;
import java.util.ArrayList;
class CompDeck extends Deck implements Comparable<Deck> {
   protected String category;
   protected Hashtable<String, Asset> assets;
  public CompDeck(String category)  {
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

   void init() {
   Asset hawk = new Asset("Hawk", "Companion");
   Asset horse = new Asset("Horse", "Companion");
   Asset hound = new Asset("Hound", "Companion");
   Asset raven = new Asset("Raven", "Companion");
   Asset wyvern = new Asset("Young Wyvern", "Companion");
   hawk.addMove("Far-seeing: ", "When you Undertake a Journey, or when you Resupply by hunting for small game, add +1.");
   hawk.addMove("Fierce: ", "When you Secure an Advantage +edge using your hawk to harass and distract your foes, add +1 and take +1 momentum on a hit.");
   hawk.addMove("Vigilant: ", "When you Face Danger +wits to detect an approaching threat, or when you Enter the Fray +wits against an ambush, add +2.");
   this.add(hawk);
   horse.addMove("Swift: ",  "When you Face Danger +edgeusing your horse’s speed and grace, or when you Undertake a Journey, add +1.");
   horse.addMove("Fearless: ", "When you Enter the Fray or Secure an Advantage +heart by charging into combat, add +1 and take +1 momentum on a hit.");
   horse.addMove("Mighty: ", "When you Strike or Clash at close range while mounted, add +1 and inflict +1 harm on a hit.");
   this.add(horse);
   hound.addMove("Sharp: ", "When you Gather Information using your hound’s keen senses to track your quarry or investigate a scene, add +1 and take +1 momentum on a hit.");
   hound.addMove("Ferocious: ", "When you Strike or Clash alongside your hound and score a hit, inflict +1 harm or take +1 momentum.");
   hound.addMove("Loyal: ", "When you Endure Stress in the company of your hound,add +1.");
   this.add(hound);
   }
}  
