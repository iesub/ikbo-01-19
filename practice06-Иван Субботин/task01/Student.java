package ru.mirea.practice06.task01;

public class Student{
    private int IDNumber;
    public Student(int IDNumber){
        this.IDNumber = IDNumber;
    }

    private double grade;
    public Student(int IDNumber, double grade){
        this.IDNumber = IDNumber;
        this.grade = grade;
    }

    public void setIDNumber(int iDNumber) {
        this.IDNumber = iDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                ", grade=" + grade +
                '}';
    }
}
