import java.util.Collections;
import java.util.List;


//Passing List into method
public class MinMaxCalculator {
    public int min(List<Integer> numbers){
        return Collections.min(numbers);
    }

    public int max(List<Integer> numbers){
        return  Collections.max(numbers);
    }
}