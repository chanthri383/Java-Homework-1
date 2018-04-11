import java.util.Scanner;

public class Main {
  
    public static void main(String[] args)  {
    
     Scanner input = new Scanner(System.in);
     System.out.print("Enter text: ");
     int characterCount = input.nextint();
    
      
     Character characters[characterCount];
      
     for (int i = 0; i < 4; i++) {
       Character character = new Character();
       String type = input.next;
       
       if (type.equals("Player) {
          String name = input.next;
          char gender = input.nextChar;
          int hitPoints = input.nextInt;
          String gear = input.nextLine  
          Player player (name, gender, hitPoints, gear);
          character = player;
       }
       else if (type.equals ("Mob")) {
          String name = input.next;
          char gender = input.nextChar;
          int hitPoints = input.nextInt;
          String zone = input.next;
          Player class = input.next;
          boolean questMob = input.next;
          character = mob;
        else if (type.equals ("Townsperson")){
          character.Name = input.next;
          character.gender = input.nextChar;
          character.hitPoints = input.nextInt;
          character.zone = input.next;
          character.questMob = input.next;
        }
         characters [i] = character;
       }
     }
