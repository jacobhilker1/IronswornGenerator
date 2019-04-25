import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class Main {
      public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

                     }

      public static void init(){
      Deck cmp = new Deck("Companion");
      Asset hawk = new Asset("Hawk", "Companion");
      Asset horse = new Asset("Horse", "Companion");
      Asset hound = new Asset("Hound", "Companion");
      Asset raven = new Asset("Raven", "Companion");
      Asset wyvern = new Asset("Young Wyvern, Companion");
      hawk.addMove("Far-seeing: ", "When you Undertake a Journey, or when you Resupply by hunting for small game, add +1."); 
      hawk.addMove("Fierce: ", "When you Secure an Advantage +edgeu sing your hawk to harass and distract your foes, add +1 and take +1 momentum on a hit.");
      hawk.addMove("Vigilant: ", "When you Face Danger +wits to detect an approaching threat, or when you Enter the Fray +wits against an ambush, add +2.");
      cmp.add(hawk);
      horse.addMove("Swift: ", "When you Face Danger +edge using your horse’s speed and grace, or when you Undertake a Journey, add +1.");
      horse.addMove("Fearless: ", "When you Enter the Fray or Secure an Advantage +heart by charging into combat, add +1 and take +1 momentum on a hit.");
      horse.addMove("Mighty: ", "When you Strike or Clash at close range while mounted, add +1 and inflict +1 harm on a hit.");
      cmp.add(horse);
      



      Deck path = new Deck("Path");

      }
}
