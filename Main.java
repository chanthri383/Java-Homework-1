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
          character.Name = input.next;
          character.gender = input.nextChar;
          character.hitPoints = input.nextInt;
          character.gear = input.nextLine            
       }
       else if (type.equals ("Mob")) {
          character.Name = input.next;
          character.gender = input.nextChar;
          character.hitPoints = input.nextInt;
          character.zone = input.next;
          character.class = input.next;
          character.questMob = input.next;
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
