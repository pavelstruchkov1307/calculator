package com.company;

public class Sum extends Operation {

     Sum(double a, double b) {
        super(a,b);
    }

    @Override
    public double execute() {
        return a + b;
    }
}
