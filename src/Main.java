import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Multiply mult = new Multiply(1);
        Sum sum = new Sum();

        mult.addNumber(2);
        mult.addNumber(3);
        mult.addNumber(4);

        sum.addNumber(2);
        sum.addNumber(3);
        sum.addNumber(4);

        mult.calculate();
        System.out.println("MULT RESULT: " + mult.getResult());
        sum.calculate();
        System.out.println("SUM RESULT: " + sum.getResult());

        CalculatorManager.resetAllCalculator();

        System.out.println("MULT AFTER RESET: " + mult.getResult());
        System.out.println("SUM AFTER RESET: " + sum.getResult());
    }
}