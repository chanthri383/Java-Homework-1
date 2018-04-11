import java.util.Scanner;

public class Main {
  
    public static void main(String[] args)  {
    
     Scanner input = new Scanner(System.in);
     System.out.print("Enter text: ");
     int characterCount = input.nextint();
    
      
     Character characters[characterCount];
      
     for (int i = 0; i < 4; i++) {
       Character character;
       String type = input.next;
       
       if (type.equals("Player) {
          Character.Name = input.next;
          Character.gender = input.nextChar;
          Character.hitPoints = input.nextInt;
          Character.gear = input.nextLine            
       }
       else if (type.equals ("Mob")) {
          Character.Name = input.next;
          Character.gender = input.nextChar;
          Character.hitPoints = input.nextInt;
          Character.zone = input.next;
          Character.class = next;
          Character.questMob = next;
        else if (type.equals ("Townsperson")){
        }
       }
     }
