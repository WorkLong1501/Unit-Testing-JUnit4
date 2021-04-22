/*
Tương tự như @Parameters, @DataPoints được sử dụng để return một bộ dữ liệu test. 
Tuy nhiên, nó đơn giản hơn @Parameters, 
chúng ta không cần phải tạo một constructor hay field tương ứng.

Để thực thi test với các @DataPoints, chúng ta cần phải sử dụng @RunWith(Theories.class). 
Các phương thức test sử dụng data từ @DataPoints, 
chúng ta sẽ thay thế @Test trên phương thức bằng @Theory.
 */
package demojunit;

import static org.junit.Assert.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryAndDataPointTest {
    
    @DataPoints
    public static int[][] data() {
        return new int[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } };
    }
    
    /*
    @DataPoint
    public static int[] input1 = new int[] { 0, 0 };
     
    @DataPoint
    public static int[] input2 = new int[] { 1, 1 };
     
    @DataPoint
    public static int[] input3 = new int[] { 2, 1 };
     
    @DataPoint
    public static int[] input4 = new int[] { 3, 2 };
     
    @DataPoint
    public static int[] input5 = new int[] { 4, 3 };
     
    @DataPoint
    public static int[] input6 = new int[] { 5, 5 };
     
    @DataPoint
    public static int[] input7 = new int[] { 6, 8 };
    */
 
    @Theory
    public void testFibonacci(final int[] inputs) {
        System.out.println(String.format("Testing with %d and %d", inputs[0], inputs[1]));
        assertEquals(inputs[1], Fibonacci.compute(inputs[0]));
    }

}
/*
@RunWith(Theories.class)
public class TheoryAndDataPointTest {
 
    @DataPoints("data1")
    public static int[][] dataPoints = new int[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } };
 
    @DataPoints("data2")
    public static int[][] data() {
        return new int[][] { { 0, 999 }};
    }
 
    @Theory
    public void givenNumber_WhenValidValue_ThenEquals(@FromDataPoints("data1") final int[] inputs) {
        System.out.println(String.format("Testing with %d and %d", inputs[0], inputs[1]));
        assertEquals(inputs[1], Fibonacci.compute(inputs[0]));
    }
 
    @Theory
    public void givenNumber_WhenInvalidValue_ThenNotEquals(@FromDataPoints("data2") final int[] inputs) {
        System.out.println(String.format("Testing with %d and %d", inputs[0], inputs[1]));
        assertNotEquals(inputs[1], Fibonacci.compute(inputs[0]));
    }
}
*/