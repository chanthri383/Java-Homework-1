
public class Npc extends Character {
  protected String zone;
  
  public Npc() {
    zone = null;
  }
  public Npc(String type_, String name_, char gender_, int hitPoints_, String zone_)
  {
    super(type_, name_, gender_, hitPoints_, zone_);
    zone = zone;
  }
  public String toString()
  {
    System.out.print("Npc");
    System.out.format("\n%15s%15s%15s%15s%25s\n", "Name","Gender","Hit Points", "Zone");
  }
  public 
