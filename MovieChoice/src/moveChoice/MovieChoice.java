/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveChoice;
import java.util.*;

/**
 *
 * @author Mark Evans
 */
public class MovieChoice {
    public static void main(String[] args) {
        int response;
        int buddyPoints = 0;
        Scanner scanChoice = new Scanner(System.in);
    
        System.out.println("What's your favorite movie genere? 0 - Comedy, 1 - Horror, 2 - Sci-Fi");
        response = scanChoice.nextInt();
        if (response == 0) {
            System.out.println("Do you like the movie 'Grown Ups' - 0, or 'Talladaga Nights' - 1?");
            response = scanChoice.nextInt();
            if (response == 0) {
                buddyPoints += 10; 
                System.out.println("Lenny - 0 or Marcus - 1?");
                response = scanChoice.nextInt();
                if (response == 0) {
                    System.out.println("Hilarious");
                    buddyPoints = buddyPoints + 10;
                }else{
                    System.out.println("Eh.");
                    buddyPoints = buddyPoints + 5;
                }
            }
            else if (response == 1) {
                System.out.println("Ricky - 0 or Cal - 1?");
                response = scanChoice.nextInt();
                if (response == 0);
                    System.out.println("Shake 'n Bake baby.");
                    buddyPoints = buddyPoints + 10;
            }else{
                System.out.println("She's a gold digger.");
                buddyPoints = buddyPoints + 5;
            }
        }
        else if (response == 1) {
            System.out.println("Do you like the movie 'Friday the 13th' - 0, or 'Nightmare on Elm Street' - 1?");
            response = scanChoice.nextInt();
            if (response == 0) {
                System.out.println("Enos - 0 or Steve - 1?");
                response = scanChoice.nextInt();
                if (response == 0) {
                    System.out.println("Amazing");
                    buddyPoints = buddyPoints + 10;
                }else{
                    System.out.println("He was weird");
                    buddyPoints = buddyPoints + 5;
                }
            }
            else if (response == 1) {
                System.out.println("Glen or Mr. Lautz?");
                response = scanChoice.nextInt();
                if (response == 0) {
                    System.out.println("Argh!");
                    buddyPoints = buddyPoints + 10;
                }else{
                    System.out.println("Airplane 2!");
                    buddyPoints = buddyPoints + 5;
                }
            }else{
                    
                    }
               
        }
        else if (response == 2) {
            System.out.println("Do you like the movie 'Star Wars' - 0, or 'Star Trek' - 1?");
            response = scanChoice.nextInt();
            if (response == 0) {
                System.out.println("Luke - 0 or Anakin - 1?");
                response = scanChoice.nextInt();
                if (response == 0) {
                    System.out.println("Ur tuff");
                    buddyPoints = buddyPoints + 10;
                }else{//make sure to put end brackets after this right now it's going right through because it thinks the next part is included in 
                    //this statement.  Your brackets are fucking you up.  make sure to always close them.
                    System.out.println("Ur soft");
                    buddyPoints = buddyPoints + 5;
                }
            }
            else if (response == 1) {
                System.out.println("Kirk or Spock?");
                response = scanChoice.nextInt();
                if (response == 0) {
                    System.out.println("Chubby Face");
                    buddyPoints = buddyPoints + 5;
                }else{
                    System.out.println("Skinny Face");
                    buddyPoints = buddyPoints + 10;
                }
            }

        }System.out.println("Buddy Points: " + buddyPoints);

    
    }
}
     
     
     
     
