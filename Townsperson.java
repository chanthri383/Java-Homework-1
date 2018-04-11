
public class player extends character {
  private String classType;
  private String armorType;
  
  public player()
  {
    classType = null;
    armorType = null;
  }
  public player(String type_, String name_, char gender_, int hitPoints_,String classType_,String armorType_)
  {
    super(type_,name_,gender_,hitPoints_);
    classType = classType_;
    armorType = armorType_;
  }
  public String toString()
  {
    System.out.print("\n\nNPC's - Towns People");
    System.out.print(super.toString() + System.out.format(("\n%15s%15s%15s%25s%15s\n", "Name", "Gender", "Hit Points","Zone","Has Quest?");
