import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MinMaxCalculatorTest {
    MinMaxCalculator test = new MinMaxCalculator();

    @Test
    void testMin() {
        int num1 = test.min(Arrays.asList(8,16,24,32,40));
        assertEquals(8,num1);
    }

    @Test
    void testMax() {
        int num2 = test.max(Arrays.asList(8,16,24,32,40));
        assertEquals(40,num2);
    }
}