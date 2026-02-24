package exercicios.ex3;

import java.util.ArrayList;

public class Multiply extends Calculator3 {
    public Multiply() {
        numbers = new ArrayList<>();
        result = 1;
        CalculatorManager3.addCalculator(this);
    }

    @Override
    public void calculate() {
        for(Integer number : numbers) {
            result *= number;
        }
    }
}
