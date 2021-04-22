/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojunit;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    // Set timeout max 3 seconds per each method tested
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1); // 1 seconds
    
    /*
    Được sử dụng khi cần test một ngoại lệ được throw ra từ phương thức được test. 
    Nếu ngoại lệ không được throw thì phương thức sẽ fail.
    */
    @Test(expected = IllegalArgumentException.class)
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() throws InterruptedException {
        Thread.sleep(5000);
        DemoJunit.divide(1, 0);
    }
    /*
    Được sử dụng để đánh dấu phương thức này để được bỏ qua (ignore/ disable), không cần thực thi test.
    Nó có thể sử dụng cho một phương thức test hay một class từ một test suite.
    */
    @Test
    @Ignore("This test case will be ignored")
    public void testEqualshelloworld() {
        String expected = "hello";
        Assert.assertEquals("world", expected);
    }
 
    /*
    Được sử dụng để đánh dấu đây là một phương thức test.@Test(timeout=1000)
    Được sử dụng khi cần giới hạn thời gian thực thi của một phương thức. 
    Nếu vượt quá thời này thì phương thức sẽ fail.
    */
    @Test(timeout=1000)
    public void testWithTimeout() {
        System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
    }
    
    /*
    Việc sử dụng thuộc tính expected trong annotation @Test có nhược điểm là 
        ta không thể kiểm tra được message của exception 
        hay trạng thái của object sau khi exception được ném ra.
    Để khắc phục điều đó ta sử dụng try/ catch.
    */
    @Test
    public void testDivideByZero() throws Exception {
        try {
            DemoJunit.divide(1, 0);
            Assert.fail("Not throw an exception");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Cannot divide by zero (0).", e.getMessage());
        }
    }
    
    /*
    Thay vì sử dụng try/ catch exception, chúng ta có thể sử dụng ExpectedException,
    nó cũng giúp chúng ta test loại và message exception.
    */
    @Rule
    public ExpectedException thrown = ExpectedException.none();
 
    @Test
    public void shouldTestExceptionMessage() throws Exception {
        // Keep this ordering: expect -> call the method which throw an exception
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Cannot divide by zero (0).");
 
        DemoJunit.divide(1, 0);
    }
    //
    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "junit".toCharArray();
        
//        int[] expected = null;
//        int[] actual = null;

        assertArrayEquals(expected, actual);
    }
    //
    @Test
    public void whenAssertingNull_thenTrue() {
        Object car = null;

        assertNull("The car should be null", car);
    }
    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue("3 is greater then 4", 3 > 4);
        assertFalse("5 is not greater then 6", 5 > 6);
    }
    @Test
    public void testAssertThatHasItems() {
        assertThat(
          Arrays.asList("Java", "Kotlin", "Scala"), 
          hasItems("Java", "Kotlin"));
    }
}
