package ru.mirea.lab02.task02;

public class Torso {
    private double torsoLength;
    private double shoulderWidth;
    private double hipWidth;
    public Torso(double torsoLength, double shoulderWidth, double hipWidth){
        this.torsoLength=torsoLength;
        this.shoulderWidth=shoulderWidth;
        this.hipWidth=hipWidth;
    }
    public void setTorsoLength(double torsoLength){
        this.torsoLength = torsoLength;
    }
    public void setShoulderWidth(double shoulderWidth){
        this.shoulderWidth = shoulderWidth;
    }
    public void setHipWidth(double hipWidth){
        this.hipWidth = hipWidth;
    }
    public double getTorsoLength(){
        return(torsoLength);
    }
    public double getShoulderWidth(){
        return(shoulderWidth);
    }
    public double getHipWidth(){
        return(hipWidth);
    }

    @Override
    public String toString() {
        return "Torso{" +
                "torsoLength=" + torsoLength +
                ", shoulderWidth=" + shoulderWidth +
                ", hipWidth=" + hipWidth +
                '}';
    }
}
