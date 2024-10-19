
import java.util.Scanner;

public class Main { 
       public static void main(String[] args) {

        //just checking to make sure class is working and so far yes
        //I plan to make the game with a UI interface once we go over that more in class in the meantime this is what we are working with
        Scanner kbd = new Scanner(System.in);

        System.out.println("Please enter your character name");
        String userName = kbd.nextLine();

        System.out.println("What is your character class");
        String userClassType = kbd.nextLine();

        Player user = new Player(userName, userClassType, 10, 5);
        
        System.out.println("\nThis is your chosen character good luck: " + user);

    }
}