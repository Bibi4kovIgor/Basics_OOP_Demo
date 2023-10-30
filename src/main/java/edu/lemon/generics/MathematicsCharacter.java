package edu.lemon.generics;

public class MathematicsCharacter implements Mathematics<Character> {
    @Override
    public Character add(Character a, Character b) {
        return (char)(a + b);
    }

    @Override
    public Character sub(Character a, Character b) {
        return (char)(a - b);
    }

    @Override
    public Character div(Character a, Character b) {
        if ((int)b != 0) {
            return (char)(a / b);
        }
        return 0;
    }

    @Override
    public Character mod(Character a, Character b) {
        return (char)(a % b);
    }

    @Override
    public Character mul(Character a, Character b) {
        return (char)(a * b);
    }
}
