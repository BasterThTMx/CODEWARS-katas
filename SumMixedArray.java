package fundamentals_;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;

public class SumMixedArray {
    /*
    Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    Return your answer as a number.
    @Test
    public void test_6() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }
    
    @Test
    public void test_7() {
        assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }
    */
    public static int sum(List<?> mixed) {
        Object[] mixedString = mixed.toArray();
        int sum = 0;
        for (Object i: mixedString) {
            int val = 0;
            if(i instanceof String) {
                val = Integer.valueOf((String) i);
            } else {
                val = (Integer) i;
            }            
            sum += val;
        }
        return sum;
    }
    public static void main(String[] args) {
        sum(Arrays.asList("1", 2, 3));                
    }
    
}
