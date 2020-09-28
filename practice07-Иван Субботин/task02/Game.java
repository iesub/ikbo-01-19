package ru.mirea.practice07.task02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private Queue<Integer> playerOne = new LinkedList<>();
    private Queue<Integer> playerTwo = new LinkedList<>();
    private int ticks = 0;

    public void readyPlayerOne(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            int buff = Integer.parseInt(numbers[i]);
            playerOne.offer(buff);
        }
    }

    public void readyPlayerTwo(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            int buff = Integer.parseInt(numbers[i]);
            playerTwo.offer(buff);
        }
    }

    public Queue updateHand(Queue hand, int cardOne, int cardTwo){
        hand.offer(cardOne);
        hand.offer(cardTwo);
        return hand;
    }

    public void gameTick(){
        ticks++;
        int cardOne = (int) playerOne.poll();
        int cardTwo = (int) playerTwo.poll();
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
            if (playerOne.peek() == null) return("Second " + ticks);
            else if (playerOne.peek() == null) return("First" + ticks);
        }
        return ("botva");
    }
}