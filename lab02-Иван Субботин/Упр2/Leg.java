package ru.mirea.lab02.task02;

public class Leg {
    private double legLength;
    public Leg(double legLength){
        this.legLength = legLength;
    }
    public double getLeg(){
        return legLength;
    }
    public void setLeg(double legLength){
        this.legLength = legLength;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legLength=" + legLength +
                '}';
    }
}
