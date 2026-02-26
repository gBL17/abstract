import java.util.ArrayList;

public class Multiply extends Calculator<Integer> {
    public Multiply(int initialResult) {
        super(initialResult);
    }

    @Override
    public void calculate() {
        for(Integer number : numbers) {
            result *= number;
        }
    }
}
