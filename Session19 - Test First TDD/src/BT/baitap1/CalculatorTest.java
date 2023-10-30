package BT.baitap1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void add() {
        double a = 1.5;
        double b = 2.5;
        Assert.assertEquals(4, calculator.add(a, b), 0);
        Assert.assertEquals(-1, calculator.add(a, b), 5);
        Assert.assertEquals(0, calculator.add(a, b), 5);
    }

    @Test
    public void subtract() {
        double a = 1.5;
        double b = 2.5;
        Assert.assertEquals(1, calculator.subtract(a, b), 2);
        Assert.assertEquals(-1, calculator.subtract(a, b), 0);
        Assert.assertEquals(0, calculator.subtract(a, b), 0);
    }
}