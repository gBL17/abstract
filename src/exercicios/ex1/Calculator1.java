package exercicios.ex1;

import java.util.ArrayList;
import java.util.List;

public class Calculator1 {
    List<Integer> numbers;
    Integer result;

    public Calculator1(){
        numbers = new ArrayList<>();
        result = 0;
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
