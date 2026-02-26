import java.util.ArrayList;
import java.util.List;

public class CalculatorManager {
    private static List<Calculator> instances = new ArrayList<>();

    public static void addCalculator(Calculator calculator){
        instances.add(calculator);
    }

    public static void resetAllCalculator() {
        for (Calculator calculator : instances) {
            calculator.result = 0;
            calculator.numbers = new ArrayList<>();
        }
    }
}
