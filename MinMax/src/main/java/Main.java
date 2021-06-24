import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinMaxCalculator calc = new MinMaxCalculator();
        System.out.println(calc.min(Arrays.asList(5,10,15,20,25)));
        System.out.println(calc.max(Arrays.asList(5,10,15,20,25)));
    }
}
