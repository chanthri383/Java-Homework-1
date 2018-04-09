public class Character {
  protected String type, name;
  protected char gender;
  protected int hitPoints;
  
  public Character() {
    type = null;
    name = null; 
    gender = '\0';
    hitPoints = 0;
  }
  public Character (String type_, String name_, char gender_, int hitPoints_)
  {
    type = type_;
    name = name_;
    gender = gender_;
    hitPoints = hitPoints_;
  }
  public String toString();
  {
    System.out.print("Player Characters");
    System.out.format("\n%15s%15s%15s%25s\n","Name", "Gender", "Hit Points");
                      
    
  }
  
  

