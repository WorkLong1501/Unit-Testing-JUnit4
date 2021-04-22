
package demojunit;

import org.junit.Assert;
import org.junit.Test;


public class DemoJunitTest {
    
    public DemoJunitTest() {
    }
    
    @Test//annotation 
    public void divide_SixDividedByTwo_ReturnThree() {
        final int expected = 3;
 
        final int actual = DemoJunit.divide(6, 2);
 
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void divide_OneDividedByTwo_ReturnZero() {
        final int expected = 0;
 
        final int actual = DemoJunit.divide(1, 2);
 
        Assert.assertEquals(expected, actual);
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
        DemoJunit.divide(1, 0);
    }
 
    @Test
    public void add_SixAddedByTwo_ReturnEight() {
        final int expected = 8;
 
        final int actual = DemoJunit.add(6, 2);
 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DemoJunit.main(args);

    }
    
    
    
}
