/*
Một parameterized test là một phương thức test bình thường, 
    được thực hiện lặp đi lặp lại bằng cách sử dụng các tham số test khác nhau. 
Nó giúp chúng ta tiết kiệm thời gian trong việc thực hiện nhiều lần 
    cùng một phương thức test với các loại đầu vào khác nhau 
    để kiểm tra các kết quả khác nhau của chức năng.
 */
package demojunit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class FibonacciIT {
    

    private int number;
    private int expected;
 
    // Inject via constructor
    public FibonacciIT(int number, int expected) {
        this.number = number;
        this.expected = expected;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /*
    // The index of the parameter is 0
    // Default value is always "value=0"
    @Parameter(value = 0)
    public int number; // NOT private
 
    // The index of the parameter is 1
    @Parameter(value = 1)
    public int expected; // NOT private
 */
    
    // The name attribute is optional, provide an unique name for test
    @Parameters(name = "{index}: Fibonacci({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
        });
    }
 
    @Test
    public void test_addTwoNumbes() {
        assertEquals(expected, Fibonacci.compute(number));
    }

    /**
     * Test of compute method, of class Fibonacci.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        int n = 0;
        int expResult = 0;
        int result = Fibonacci.compute(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
