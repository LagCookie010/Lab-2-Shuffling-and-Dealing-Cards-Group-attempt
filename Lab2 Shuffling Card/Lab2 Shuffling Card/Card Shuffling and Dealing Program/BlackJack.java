// Name: Darren Lagbao, Conner Havlicek
// Date: 10/7/24
// File: BlackJack.java

import java.util.*;
import java.security.SecureRandom;

    

public class BlackJack {
    public static void BlackJackGame(String args[])
    {
        boolean isPlaying = true;
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.Shuffle(); // place cards in a random order

        Scanner console = new Scanner(System.in);
        boolean isDrawing = true;
        Card[] myHand = new Card[2];
        int handValue = 0;
        int DealerValue = 0;
        boolean DrawACard = false;

        Manager.Introduction(args);

        System.out.println("/-/ Lets Start! /-/");
        System.out.println("Your first two cards are...");
        
        for(int i = 0; i < myHand.length; i++)
        {
            myHand[i] = myDeckOfCards.dealCard();
            System.out.println(myHand[i]);
            String face = "";
            for(int y = 0; y <= 2; y++){
                face += myHand[i].toString().charAt(y);
            }
            switch (face) {
                case "Ace":
                    handValue += 1;
                    break;
                case "Deu":
                    handValue += 2;
                    break;
                case "Thr":
                    handValue += 3;
                    break;
                case "Fou":
                    handValue += 4;
                    break;
                case "fiv":
                    handValue += 5;
                    break;
                case "Six":
                    handValue += 6;
                    break;
                case "Sev":
                    handValue += 7;
                    break;
                case "Eig":
                    handValue += 8;
                    break;
                case "Nin":
                    handValue += 9;
                    break;
                case "Ten":
                    handValue += 10;
                    break;
                default:
                    handValue += 10;
                    break;
            }
            
        }//end of drawing starting hand.

        System.out.println("Your hand value is " + handValue);

        DealerValue = DealerHands(2, myHand, myDeckOfCards, console);
        //Dealer draw hands


        while (handValue < 21 && isDrawing) {
            
            System.out.print("\nDraw or Stay: ");
            String input = "";
            input = console.next().toLowerCase();
            switch (input) {
                case "draw":
                    Card drawnCard = myDeckOfCards.dealCard();
                    System.out.println("You drew " + drawnCard);
                    String face = "";
                    for(int y = 0; y <= 2; y++){
                        face += drawnCard.toString().charAt(y);
                    }
                    switch (face) {
                        case "Ace":
                            handValue += 1;
                            break;
                        case "Deu":
                            handValue += 2;
                            break;
                        case "Thr":
                            handValue += 3;
                            break;
                        case "Fou":
                            handValue += 4;
                            break;
                        case "fiv":
                            handValue += 5;
                            break;
                        case "Six":
                            handValue += 6;
                            break;
                        case "Sev":
                            handValue += 7;
                            break;
                        case "Eig":
                            handValue += 8;
                            break;
                        case "Nin":
                            handValue += 9;
                            break;
                        case "Ten":
                            handValue += 10;
                            break;
                        default:
                            handValue += 10;
                            break;
                    }
                    break;
                case "stay":

                DrawACard = DealerThinks(DealerValue);
                if (DrawACard == true) {
                    DealerValue = DealerHands(1, myHand, myDeckOfCards, console);

                }
                    isDrawing = false;
                    break;
                    
                default:
                    break;
            }
            System.out.println("Your hand value is " + handValue);
            

            
        }// repeating loop after drawing.

        if(handValue == 21){
            System.out.println("You Win! you got 21 exact!");
            System.out.println("The Dealer value is " + DealerValue);

        }
        if(DealerValue < handValue && handValue <= 21) {
            System.out.println("You beat the Dealer's Hand. You won!");
            System.out.println("The Dealer value is " + DealerValue);

        }
        if (DealerValue ==21) {
            System.out.println("Dealer got 21. You lost");
            System.out.println("The Dealer value is " + DealerValue);

        }
        if (handValue > DealerValue && handValue > 21) {
            System.out.println("You lost to the Dealer Hands!");
            System.out.println("The Dealer value is " + DealerValue);

        }
         if(DealerValue > 21){
            System.out.println("You Won! Dealer went over 21!");
            System.out.println("The Dealer value is " + DealerValue);
        }
        if (DealerValue == handValue) {
            System.out.println("Tie! You both have the same hand value.");
            System.out.println("The Dealer value is " + DealerValue);
        }
        else if(handValue > 21){
            System.out.println("You Lose! went over 21!");
            System.out.println("The Dealer value is " + DealerValue);
        }

        //System.out.println(card01 + " and " + card02);
        

        /* 
        while(isPlaying)
        {
            System.out.println("Lets Start!");
            System.out.println("Your first two cards are...");
            System.out.println(myDeckOfCards.dealCard() + " and " + myDeckOfCards.dealCard());

        }
        */

    }//blackjackgame ends


        public static int DealerHands(int DealerDraw, Card[] myHand, DeckOfCards myDeckOfCards, Scanner console){
        int DealerValue = 0;

            for(int i = 0; i < DealerDraw; i++)
        {
            myHand[i] = myDeckOfCards.dealCard();
            String face = "";
            for(int y = 0; y <= 2; y++){
                face += myHand[i].toString().charAt(y);
            }
            switch (face) {
                case "Ace":
                DealerValue += 1;
                    break;
                case "Deu":
                DealerValue += 2;
                    break;
                case "Thr":
                DealerValue += 3;
                    break;
                case "Fou":
                DealerValue += 4;
                    break;
                case "fiv":
                DealerValue += 5;
                    break;
                case "Six":
                DealerValue += 6;
                    break;
                case "Sev":
                DealerValue += 7;
                    break;
                case "Eig":
                DealerValue += 8;
                    break;
                case "Nin":
                DealerValue += 9;
                    break;
                case "Ten":
                DealerValue += 10;
                    break;
                default:
                DealerValue += 10;
                    break;
            }
            
        }//end of drawing starting hand.


        System.out.println("/-/ Dealer drew his hand. /-/");
        return DealerValue;
            }

        
            public static boolean DealerThinks(int DealerValue){
                 SecureRandom DealerGuess = new SecureRandom();
                int Deciding = DealerGuess.nextInt(100);
                Boolean DrawACard = false;

                if (Deciding > 20 && DealerValue < 10 ) {
                    DrawACard = true;
                    System.out.println("Dealer Drawed");
                    return DrawACard;
                }

                  if (Deciding > 50 && DealerValue < 16 && DealerValue > 9 ) {
                    DrawACard = true;
                    System.out.println("Dealer Drawed");
                    return DrawACard;
                }
                else {
                    System.out.println("Dealer Stayed");
                    DrawACard = false;
                    return DrawACard;
                }

            }


}