import java.util.Scanner;
import java.util.Hashtable;
import java.io.PrintWriter;
import java.io.File;
    public class Character {
      private String name;
      private Hashtable<String, Integer> stats;
      private Hashtable<String, Asset> assets;

       public Character(String name) {
       this.name = name;
       stats = new Hashtable<String,Integer>();
       assets = new Hashtable<String,Asset>();

       }

           }  
