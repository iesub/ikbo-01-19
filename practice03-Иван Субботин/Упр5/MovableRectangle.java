package ru.mirea.practice03.task05;


import ru.mirea.practice03.task04.Movable;
import ru.mirea.practice03.task04.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    };

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString(){
        return("TopLeftPointInf: " + topLeft.toString() + " BottomRightInf: " + bottomRight.toString());
    }
}
