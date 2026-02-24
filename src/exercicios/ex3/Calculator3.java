package exercicios.ex3;

import java.util.List;

public abstract class Calculator3 {
    public List<Integer> numbers;
    public Integer result;

    public void addNumber(Integer number){
        numbers.add(number);
    }

    public void calculate(){}

    public Integer getResult(){
        return result;
    }
}
