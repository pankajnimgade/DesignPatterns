package seven.test.source;

import junit.framework.TestCase;

/**
 * Created by Pankaj Nimgade on 31-03-2016.
 */
public class JavaTest extends TestCase {
    protected int value1, value2;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        value1 = 3;
        value2 = 3;
    }
    public void testAdd(){
        double result= value1 + value2;
        assertTrue(result == 6);
    }
}
