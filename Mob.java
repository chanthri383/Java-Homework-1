import "Npc.java";

 public class Mob extends Npc {
  private String classType;
  private boolean questMob;
   
  public Mob() {
    classType = null;
    questMob = false;
  }
   
  public(String type_, String name_, char gender_, int hitPoints_, String zone_,String classType_, boolean questMob_)
  {
    super(type_,name_,gender_,hitPoints_,zone_,classType_,questMob_);
    classType = classType_;
    questMob = questMob_;
  }

