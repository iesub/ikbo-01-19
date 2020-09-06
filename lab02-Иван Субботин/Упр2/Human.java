package ru.mirea.lab02.task02;

public class Human {
    public Leg leftLeg;
    public Hand leftHand;
    public Leg rightLeg;
    public Hand rightHand;
    public Torso torso;
    public Head head;

    public Human(boolean bold, String headForm, double torsoLength, double shoulderWidth, double hipWidth,double handLength, double legLength){
        head = new Head(bold,headForm);
        torso = new Torso(torsoLength, shoulderWidth, hipWidth);
        leftHand = rightHand = new Hand(handLength);
        rightLeg = leftLeg = new Leg(legLength);
    }

    public void changeLegs(double legLength){
        rightLeg.setLeg(legLength);
        leftLeg.setLeg(legLength);
    }

    public void changeHands(double handLength){
        leftHand.setHand(handLength);
        rightHand.setHand(handLength);
    }

    public void changeTorso(double torsoLength, double shoulderWidth, double hipWidth){
        torso.setShoulderWidth(shoulderWidth);
        torso.setHipWidth(hipWidth);
        torso.setTorsoLength(torsoLength);
    }

    public void changeHead(boolean bold, String headForm){
        head.setBold(bold);
        head.setHeadForm(headForm);
    }

    @Override
    public String toString() {
        return "Human{" +
                "leftLeg=" + leftLeg +
                ", leftHand=" + leftHand +
                ", rightLeg=" + rightLeg +
                ", rightHand=" + rightHand +
                ", torso=" + torso +
                ", head=" + head +
                '}';
    }
}
