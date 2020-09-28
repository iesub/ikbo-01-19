package ru.mirea.practice07;

import java.util.Scanner;
import java.util.Stack;

public class Game {
    private Stack playerOne = new Stack();
    private Stack playerTwo = new Stack();
    private int ticks = 0;

    public void readyPlayerOne(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 4; i >= 0; i--){
            int buff = Integer.parseInt(numbers[i]);
            playerOne.push(buff);
        }
    }

    public void readyPlayerTwo(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 4; i >= 0; i--){
            int buff = Integer.parseInt(numbers[i]);
            playerTwo.push(buff);
        }
    }

    public Stack updateHand(Stack hand, int cardOne, int cardTwo){
        Stack buff = new Stack();
        while(!hand.empty()){
            buff.push(hand.pop());
        }
        hand.push(cardTwo);
        hand.push(cardOne);
        while(!buff.empty()){
            hand.push(buff.pop());
        }
        return hand;
    }

    public void gameTick(){
        ticks++;
        int cardOne = (int) playerOne.pop();
        int cardTwo = (int) playerTwo.pop();
        if(cardOne == 0 & cardTwo == 9){
            playerOne = updateHand(playerOne, cardOne, cardTwo);
        } else if(cardOne == 9 & cardTwo == 0){
            playerTwo = updateHand(playerTwo, cardOne, cardTwo);
        } else if(cardOne > cardTwo){
            playerOne = updateHand(playerOne, cardOne, cardTwo);
        } else {
            playerTwo = updateHand(playerTwo, cardOne, cardTwo);
        }
    }

    public String gameStart(){
        readyPlayerOne();
        readyPlayerTwo();
        while(ticks!=106){
            gameTick();
            if (playerOne.empty()) return("Second " + ticks);
            else if (playerOne.empty()) return("First" + ticks);
        }
        return ("botva");
    }
}
