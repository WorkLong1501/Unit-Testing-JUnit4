/*
Các phương thức test trong một class nên được viết một cách độc lập,
không phụ thuộc lẫn nhau nên thứ tự thực thi một lớp không quan trọng. 
Tuy nhiên, chúng ta có thể xác định thứ tự thực thi của các method trong 
class test bằng cách dùng annotation @FixMethodOrder ở mức class. 
Có 3 kiểu sắp xếp là:
    MethodSorters.DEFAULT
    MethodSorters.JVM
    MethodSorters.NAME_ASCENDING
 */
package demojunit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderTest {
    
    public FixMethodOrderTest() {
    }
    
    @Test
    public void test_11() {
        Assert.assertTrue(true);
    }
 
    @Test
    public void test_1() {
        Assert.assertTrue(true);
    }
    @Test
    public void test_2() {
        Assert.assertTrue(true);
    }
 
    @Test
    public void test_10() {
        Assert.assertTrue(true);
    }
 
    
}
