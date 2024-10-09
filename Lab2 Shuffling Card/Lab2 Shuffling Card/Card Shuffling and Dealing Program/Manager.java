// Name: Darren Lagbao, Conner Havlicek
// Date: 10/2/2024
// Class: CS 145, Computer Science 2, Darrell Criss
// Lab: 2, Card Shuffling and Dealing Program
// Citation: W3 Schools, Darrell Criss's Lectures, 
// Purpose: A Card Game Program, using a 3 separate classes: Card, Manager, and Test Class.
// Using private modifier to securely store the Cards until a Accessor Method initializes it. 
// Class Purpose: Manager is the class hosting the methods, storing methods for both the Card
// and Test classes.
// Notes:

import java.util.Scanner; 

public class Manager {


    //-Introduction + Instructions-//
    public static void Introduction(String[] args) {

        Divider(args);
        System.out.println("We'll be playing a game of Blackjack. The descendent of the Twenty-One game.");
        System.out.println("The Dealer hands two random cards to the players. The dealer will also get 2 cards.");
        System.out.println("Your goal is to get to as close to 21 on your cards' faces. ");
        Divider(args);
    
    }




    //- Misc. Methodss -//
    public static void Divider(String[] args) {
        System.out.println("");
        System.out.println("+--==--+--==--+--==--+--==--+--==--+--==--+--==--+--==--+");
        System.out.println("");
    }





public static void Play(String[] args) {
    System.out.println("Would you like to play?");
}












}// end of Manager class
