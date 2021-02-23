package com.company;

public class Difference extends Operation {

    Difference(double a, double b) {
        super(a,b);
    }

    @Override
    public double execute() {
        return a - b;
    }
}
