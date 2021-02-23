package com.company;

public class Composition extends Operation{

    Composition(double a, double b) {
        super(a,b);
    }

    @Override
    public double execute() {
        return a * b;
    }
}
