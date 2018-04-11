import java.util.Scanner;

public class Main {
  
    public static void main(String[] args)  {
    
     Scanner input = new Scanner(System.in);
     System.out.print("Enter text: ");
     int characterCount = input.nextint();
    
      
     Character characters[characterCount];
      
     for (int i = 0; i < characterCount; i++) {
       Character character = new Character();
       String type = input.next;
       
       if (type.equals("Player) {
          String name = input.next;
          char gender = input.nextChar;
          int hitPoints = input.nextInt;
          String class = input.nextLine;
          if( class == "Mage")
                       {
                         armorType == "Cloth";
                       }
          Player player (name, gender, hitPoints, gear);
          character = player;
       }
       else if (type.equals ("Mob")) {
          String name = input.next;
          char gender = input.nextChar;
          int hitPoints = input.nextInt;
          String zone = input.next;
          Player class = input.next;
          String rawBool = input.next;
          boolean questMob = ((rawBool.isEqual("true")) ? true : false);
          character = mob;
        else if (type.equals ("Townsperson")){
          String Name = input.next;
          char gender = input.nextChar;
          int hitPoints = input.nextInt;
          String zone = input.next;
          boolean questMob = ((rawBool.isEqual("true")) ? true : false);
        }
         characters [i] = character;
         
         for(int i = 0; i < characterCount; i++)
         {
            System.out.println(characters[i].toString());
         }
       }
     }
