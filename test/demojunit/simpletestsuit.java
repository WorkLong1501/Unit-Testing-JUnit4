package demojunit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DemoJunitTest.class,NewEmptyJUnitTest.class})
public class simpletestsuit {

    @BeforeClass
    public static void setUpClass() throws Exception {
        /*
        Phương thực được đánh dấu với Annotation này sẽ được gọi trước mỗi khi phương thức @Test được gọi.
        Nó thường được sử dụng để khởi tạo dữ liệu trước khi thực thi một phương thức @Test.
        
        Phương thực được đánh dấu với Annotation này sẽ được gọi trước khi thực thi tất cả các phương thức @Test được gọi trong một Test class. 
        Phương thức này chỉ được gọi một lần duy nhất.
        Phương thức đánh dấu Annotation này phải là static.
        Nó thường được sử dụng để khởi tạo dữ liệu cho việc thực thi một Test class.
        */
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        /*
        Phương thực được đánh dấu với Annotation này sẽ được gọi sau mỗi khi phương thức @Test được gọi.
        Nó thường được sử dụng để dọn dẹp bộ nhớ sau khi thực thi một phương thức @Test.
        
        Tương tự như @BeforeClass, nhưng nó được gọi sau khi kết thúc thực thi các phương thức @Test. 
        Phương thức này chỉ được gọi một lần duy nhất.
        Phương thức đánh dấu Annotation này phải là static.
        Nó thường được sử dụng để dọn dẹp bộ nhớ sau khi thực thi tất cả các phương thức @Test trong một Test class.
        */
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
