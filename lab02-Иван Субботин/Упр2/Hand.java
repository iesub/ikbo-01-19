package ru.mirea.lab02.task02;

public class Hand {
    private double handLength;
    public Hand(double handLength){
        this.handLength = handLength;
    }
    public double gettHand(){
        return handLength;
    }
    public void setHand(double handLength){
        this.handLength = handLength;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handLength=" + handLength +
                '}';
    }
}
