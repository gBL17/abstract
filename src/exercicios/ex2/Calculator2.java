package exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {
    List<Integer> numbers;
    Integer result;

    public Calculator2(){
        numbers = new ArrayList<>();
        result = 0;
        CalculatorManager2.addCalculator(this);
    }

    public void addNumber(Integer number){
        numbers.add(number);
    }

    public void calculateSUM(){
        for (Integer number : numbers) {
            result += number;
        }
    }

    public Integer getResult(){
        return result;
    }
}
