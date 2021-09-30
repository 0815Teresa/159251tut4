package cn.massey.tut4;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for the method of add.
 */
public class TestCalc
{
    
    @Test
    public void teatAdd()
    {
	    Calc cal = new Calc();
	    int res = cal.add(3, 5);
	    Assert.assertEquals(8, res);
    }

    @Test
    public void testSubtract()
    {
	    Calc cal = new Calc;
	    int res = cal.subtract(8, 5);
	    Assert.assertEquals(3, res);
    }
}

