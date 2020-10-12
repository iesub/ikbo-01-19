package ru.mirea.practice10.task01;

public class ConcreteFactory implements ComplexAbstractFactory{

    public Complex createComplex() {
        Complex number = new Complex(1, 1);
        return number;
    }

    public Complex crateComplex(int real, int image) {
        Complex number = new Complex(real, image);
        return number;
    }
}
