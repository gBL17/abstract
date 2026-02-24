package exercicios.ex3;

import java.util.ArrayList;

public class Sum extends Calculator3 {
    public Sum() {
        numbers = new ArrayList<>();
        result = 0;
        CalculatorManager3.addCalculator(this);
    }

    @Override
    public void addNumber(Integer number) {
        numbers.add(number);
    }

    @Override
    public void calculate() {
        for(Integer number : numbers) {
            result += number;
        }
    }

    @Override
    public Integer getResult() {
        return result;
    }
}
