package BT.baitap4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {
    @Test
    public void findMax() {
        int [] arr = {1, 2, 3, 4, 5, 6};

        Assert.assertEquals(6, FindMax.findMax(arr));

        Assert.assertNotEquals(1, FindMax.findMax(arr));

    }
}