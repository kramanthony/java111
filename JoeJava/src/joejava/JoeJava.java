/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joejava;
import java.util.Scanner;
/**
 *
 * @author Mark Evans
 */
public class JoeJava {
    public static void main(String[] args) {
        

        
        Scanner userInputScanner = new Scanner(System.in); // scanner for user input
        int userName = userInputScanner.nextInt(); // int for user's name input on prompt.
        System.out.println("Hey, what's your name?");
        userName = userInputScanner.nextInt(); // Set user's name input into "userName" int.
        System.out.println("What's up," + userName + "! Thank you for going through this survey to see if you'd want to join Joe Java!");
        System.out.println("Survey's questions can be answered by rating using the following numbers; 1 (worst), 2, 3, 4, and 5(best).");
        System.out.println("Q1: On a scale of 1(worst)-5(best), how much do you enjoy coding? Be Honest!");
        int Scanner = userInputScanner.nextInt(); // Read user's response from 1 - 5.
    }
    
}
