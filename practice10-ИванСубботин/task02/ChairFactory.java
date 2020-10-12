package ru.mirea.practice10.task02;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        VictorianChair chair = new VictorianChair(357);
        return chair;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        FunctionalChair chair = new FunctionalChair();
        return chair;
    }

    @Override
    public MagicalChair createMagicalChair() {
        MagicalChair chair = new MagicalChair();
        return chair;
    }
}
