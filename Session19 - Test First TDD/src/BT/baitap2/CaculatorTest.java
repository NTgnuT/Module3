package BT.baitap2;

import BT.baitap1.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {
    Caculator caculator = new Caculator();
    @Test
    public void multiplication() {
        double a = 2;
        double b = 3;
        Assert.assertEquals(1, caculator.multiplication(a, b), 5);
        Assert.assertEquals(-1, caculator.multiplication(a, b), 5);
        Assert.assertEquals(0, caculator.multiplication(a, b), 5);
    }
}