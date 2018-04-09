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
  public Character (String type1, String name1, char gender1, int pointHits)
  {
    type = type1;
    name = name1;
    gender = gender1;
    hitPoints = pointHits;
  }
  
  

