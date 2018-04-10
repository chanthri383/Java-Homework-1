import "Npc.java";

 public class Mob extends Npc {
  private String classType;
  private boolean questMob;
   
  public Mob() {
    classType = null;
    questMob = false;
  }
   
  public Mob(String type_, String name_, char gender_, int hitPoints_, String zone_,String classType_, boolean questMob_)
  {
    super(type_,name_,gender_,hitPoints_,zone_,classType_);
    classType = classType_;
    questMob = questMob_;
  }
  public String toString() 
  { 
     System.out.print("\n\nNPC's - Mobs");
     System.out.format(super.toString() + "\n%15s%15s%15s%25s%15s%15s\n", "Name", "Gender", "Hit Points","Zone","Class","Quest Mob");
  }
     
    

