// Name: Darren Lagbao, Conner Havlicek
// Date: 10/2/2024
// Class: CS 145, Computer Science 2, Darrell Criss
// Lab: 2, Card Shuffling and Dealing Program
// Citation: W3 Schools, Darrell Criss's Lectures, 
// Purpose: A Card Game Program, using a 3 separate classes: Card, Manager, and Test Class.
// Using private modifier to securely store the Cards until a Accessor Method initializes it. 
// Class Purpose: Card is the class storing and dealing the the card deck. 
// Notes:


//Card.java
// Card class represents a playing Card
public class Card {
    private final String face; // face of card("Ace", "Deuce",....)
    private final String suit; // suit of card

    // two argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    } // end of constructor

    // return string representation of card
    public String toString(){
        return face + " of " + suit;
    } // end of toString method




    
    /* 
    public final int Number_of_Cards = 52;
    private card[] deck = new card[Number_of_Cards];

    private final String face; // Aces, twos, kings, etc.
    private final String suit; // Spades, Clubs, Diamonds, Hearts.
    */


}// End of Card class
