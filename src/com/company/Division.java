package com.company;

public class Division extends Operation {

    Division(double a, double b) {
        super(a,b);
    }

    @Override
    public double execute() {
        return a / b;
    }
}
