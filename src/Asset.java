import java.util.Hashtable;
class Asset implements Comparable<Asset> {
  protected Hashtable<String,String> moves;
  protected String name, category, trigger;
  protected Hashtable<String, Boolean> req;
  protected boolean required;
  public Asset(String name) {
    moves = new Hashtable<String,String>(3);
    this.name = name;
    this.required = false;
    req = new Hashtable<String, Boolean>();
  }

  public Asset(String name, String category) {
    moves = new Hashtable<String,String>(3);
    this.name = name;
    this.category = category;
  }

  void addMove(String name, String move) {
    moves.put(name, move);
  }

  String getMove(String name){
    return moves.get(name);
  }

  Hashtable getMoves(){
    return moves;
  }

  public String toString(){
    return this.name + "\n" + moves.keys() + ".  " + moves.values() + ".";
  }

  public boolean equals(Asset a){
    if(a.category.equalsIgnoreCase(this.category)){
      return true;
    } else {
    return false;
  }
  }

  public int compareTo(Asset a){
    if (this.name.equals(a.name)){
      return this.category.compareTo(a.category);
  } else {
    return this.name.compareTo(a.name);
}
}
  void setReq(String st){
    String m = moves.get(st);
    this.required = true;
    req.put(st +": " + m, required);
  }
  
  String getName(){ return this.name;}
}
