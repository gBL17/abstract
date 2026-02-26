import java.util.ArrayList;
import java.util.List;

public abstract class Calculator<T extends Number> {
    protected List<T> numbers;
    protected Integer result;

    public Calculator(){
        this(0);
    }

    public Calculator(int initialResult){
        this.numbers = new ArrayList<>();
        this.result = initialResult;
        CalculatorManager.addCalculator(this);
    }

    public void addNumber(T number){
        numbers.add(number);
    }

    public Integer getResult(){
        return result;
    }

    public abstract void calculate();
}
