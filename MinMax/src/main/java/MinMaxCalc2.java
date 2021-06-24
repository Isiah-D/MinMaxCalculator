import java.util.Collections;
import java.util.List;


//Constructor approach
public class MinMaxCalc2 {
    public int min;
    public int max;

    public MinMaxCalc2(List<Integer> list) {
        this.min = Collections.min(list);
        this.max = Collections.max(list);
    }
}