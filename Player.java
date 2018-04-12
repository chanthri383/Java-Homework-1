public class Player extends Character {
    private String classType, armorType;

    public Player()
    {
        classType = null;
        armorType = null;
    }
    public Player(String type1, String name1, char gender1, int pointHits, String classType1,String armorType1) {
        super(type1, name1, gender1, pointHits);
        classType = classType1;
        armorType = armorType1;
    }
    public String toString()
    {
        return super.toString() + String.format(); // not sure for this part
    }
}
