package exercicios;

import exercicios.ex1.Calculator1;
import exercicios.ex2.Calculator2;
import exercicios.ex2.CalculatorManager2;
import exercicios.ex3.Calculator3;
import exercicios.ex3.CalculatorManager3;
import exercicios.ex3.Multiply;
import exercicios.ex3.Sum;

public class Exercicios {
    public void ex1(){
        System.out.println(":::EX1:::");
        Calculator1 calculator = new Calculator1();

        calculator.addNumber(4);
        calculator.addNumber(2);
        calculator.addNumber(6);

        calculator.calculateSUM();

        System.out.println( "Resultado: " + calculator.getResult() );
    }

    public void ex2(){
        System.out.println(":::EX2:::");
        Calculator2 c1 = new Calculator2();
        c1.addNumber(4);

        Calculator2 c2 = new Calculator2();
        c2.addNumber(4);

        Calculator2 c3 = new Calculator2();
        c3.addNumber(5);

        CalculatorManager2.resetAllCalculator();

        c1.calculateSUM();
        System.out.println("Calculate 1: " + c1.getResult());
        c2.calculateSUM();
        System.out.println("Calculate 2: " + c2.getResult());
        c3.calculateSUM();
        System.out.println("Calculate 3: " + c3.getResult());
    }

    public void ex3(){
        System.out.println(":::EX3:::");
        Sum sum = new Sum();

        sum.addNumber(2);
        sum.addNumber(3);
        sum.addNumber(4);
        sum.calculate();
        System.out.println("Result SUM: " + sum.getResult());

        Multiply mul = new Multiply();

        mul.addNumber(2);
        mul.addNumber(3);
        mul.addNumber(4);
        mul.calculate();
        System.out.println("Result MUL: " + mul.getResult());

        CalculatorManager3.resetAllCalculator();

        sum.calculate();
        System.out.println("Result AFTER CLEAR SUM: " + sum.getResult());
        mul.calculate();
        System.out.println("Result AFTER CLEAR MUL: " + mul.getResult());

    }
}
