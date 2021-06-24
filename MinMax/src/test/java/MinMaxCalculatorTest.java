import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MinMaxCalculatorTest {
    MinMaxCalculator test = new MinMaxCalculator();
    MinMaxCalc2 test2 = new MinMaxCalc2(Arrays.asList(18,9,36,45,27));

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

    @Test
    void test2A(){
        int num3 = test2.min;
        assertEquals(9,num3);
    }
    @Test
    void test2B(){
        int num4 = test2.max;
        assertEquals(45,num4);
    }
}