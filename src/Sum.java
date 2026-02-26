import java.util.ArrayList;

public class Sum extends Calculator<Integer> {
    public Sum() {
        super();
    }

    @Override
    public void calculate() {
        for(Integer number : numbers) {
            result += number;
        }
    }
}
