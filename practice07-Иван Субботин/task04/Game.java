package ru.mirea.practice07.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Double> playerOne = new ArrayList<>();
    private ArrayList<Double>  playerTwo = new ArrayList<>();
    private int ticks = 0;

    public void readyPlayerOne(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            double buff = Double.parseDouble(numbers[i]);
            playerOne.add(buff);
        }
    }

    public void readyPlayerTwo(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        for(int i = 0; i < 5; i++){
            double buff = Double.parseDouble(numbers[i]);
            playerTwo.add(buff);
        }
    }

    public ArrayList updateHand(ArrayList<Double> hand, double cardOne, double cardTwo){
        ArrayList<Double> buff = new ArrayList<>();
        hand.add(cardOne);
        hand.add(cardTwo);
        return hand;
    }

    public void gameTick(){
        ticks++;
        double cardOne = playerOne.get(0);
        playerOne.remove(0);
        double cardTwo = playerTwo.get(0);
        playerTwo.remove(0);
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
            if (playerOne.size() == 0) return("Second " + ticks);
            else if (playerOne.size() == 0) return("First" + ticks);
        }
        return ("botva");
    }
}
