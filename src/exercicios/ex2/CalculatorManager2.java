package exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class CalculatorManager2 {
    private static List<Calculator2> instances = new ArrayList<>();

    public static void addCalculator(Calculator2 calculator){
        instances.add(calculator);
    }

    public static void resetAllCalculator() {
        for (Calculator2 calculator : instances) {
            calculator.numbers = new ArrayList<>();
        }
    }
}
