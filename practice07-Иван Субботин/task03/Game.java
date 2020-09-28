package ru.mirea.practice07.task03;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Deque<Integer> playerOne = new LinkedList<>();
    private Deque<Integer> playerTwo = new LinkedList<>();
    private int ticks = 0;

    public void readyPlayerOne(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            int buff = Integer.parseInt(numbers[i]);
            playerOne.addLast(buff);
        }
    }

    public void readyPlayerTwo(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            int buff = Integer.parseInt(numbers[i]);
            playerTwo.addLast(buff);
        }
    }

    public Deque updateHand(Deque hand, int cardOne, int cardTwo){
        hand.addLast(cardOne);
        hand.addLast(cardTwo);
        return hand;
    }

    public void gameTick(){
        ticks++;
        int cardOne = (int) playerOne.pollFirst();
        int cardTwo = (int) playerTwo.pollFirst();
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
            if (playerOne.peekFirst() == null) return("Second " + ticks);
            else if (playerOne.peekFirst() == null) return("First" + ticks);
        }
        return ("botva");
    }
}
