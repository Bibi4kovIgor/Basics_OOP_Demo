package edu.lemon.generics;

public class MathematicsInteger implements Mathematics<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return  a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        if(b != 0) {
            return a / b;
        }
        return 0;
    }

    @Override
    public Integer mod(Integer a, Integer b) {
        return a % b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
