package exercicios.ex3;

import java.util.ArrayList;
import java.util.List;

public class CalculatorManager3 {
    private static List<Calculator3> instances = new ArrayList<>();

    public static void addCalculator(Calculator3 calculator){
        instances.add(calculator);
    }

    public static void resetAllCalculator() {
        for (Calculator3 calculator : instances) {
            calculator.result = 0;
            calculator.numbers = new ArrayList<>();
        }
    }
}
