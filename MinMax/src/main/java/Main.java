import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Method injections
        MinMaxCalculator calc = new MinMaxCalculator();
        System.out.println("The min is: " + calc.min(Arrays.asList(5,10,15,20,25)));
        System.out.println("The max is: " + calc.max(Arrays.asList(5,10,15,20,25)) +"\n");

        MinMaxCalc2 calc2 = new MinMaxCalc2(Arrays.asList(21,7,28,14,35));
        System.out.println("The min is: " + calc2.min);
        System.out.println("The max is: " + calc2.max);
    }
}
