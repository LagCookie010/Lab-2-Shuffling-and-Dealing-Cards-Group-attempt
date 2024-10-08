// Name: Darren Lagbao, Conner Havlicek
// Date: 10/7/24
// File: BlackJack.java

import java.util.*;

public class BlackJack {
    public static void main(String args[])
    {
        boolean isPlaying = true;
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.Shuffle(); // place cards in a random order

        Scanner console = new Scanner(System.in);
        boolean isDrawing = true;
        Card[] myHand = new Card[2];
        int handValue = 0;

        Manager.Introduction(args);

        System.out.println("Lets Start!");
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
            
        }

        System.out.println("Your hand value is " + handValue);

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
                    isDrawing = false;
                    break;
                    
                default:
                    break;
            }
            System.out.println("Your hand value is " + handValue);

            
        }

        if(handValue == 21){
            System.out.println("You Win");
        }
        else if(handValue > 21){
            System.out.println("You Lose");
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

    }
}