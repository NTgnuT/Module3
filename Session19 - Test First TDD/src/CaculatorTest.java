import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {
    private Caculator caculator;
    @Before
    public void setUp() throws Exception {
        System.out.println("Setup test");
        caculator = new Caculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test done");
    }

    @Test
    public void add() {
        double a = 1.2;
        double b = 1.5;
        Assert.assertEquals(2.7, caculator.add(a, b), 0);
    }

    @Test
    public void multiply() {
        double a = 3.0;
        double b = 1.5;
        Assert.assertEquals(4.5, caculator.add(a, b), 0);
    }

    @Test
    public void divide() {
        double a = 5.2;
        double b = 2.0;
        Assert.assertTrue(caculator.divide(a, b)==2.6);
    }

    @Test
    public void falseDivide() {
        double a = 3.0;
        double b = 3.0;
        Assert.assertNotEquals(0.5, caculator.divide(a, b), 0 );
    }

    @Test
    public void divineZero() {
        double a = 1.0;
        double b = 0.0;
        Assert.assertThrows(ArithmeticException.class, caculator);
    }
}