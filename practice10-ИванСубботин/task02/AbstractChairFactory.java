package ru.mirea.practice10.task02;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicalChair createMagicalChair();
    public FunctionalChair createFunctionalChair();
}
