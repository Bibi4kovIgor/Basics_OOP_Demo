package edu.lemon.generics;

public class MathematicsDouble implements Mathematics<Double> {
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double div(Double a, Double b) {
        if (a != 0) {
            return a / b;
        }
        return 0d;
    }

    @Override
    public Double mod(Double a, Double b) {
        return a % b;
    }

    @Override
    public Double mul(Double a, Double b) {
        return a * b;
    }
}
