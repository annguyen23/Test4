package edu.uwb;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Adder adder;

    @Before
    public void initialize()
    {
        adder = new Adder();
    }

    @Test
    public void shouldAddTwoAndTwo()
    {
        int testValue = adder.AddPositiveInts(2, 2);
        assertTrue(testValue == 4);
    }

    @Test
    public void shouldReturnNegativeOneForBadA()
    {
        int testValue = adder.AddPositiveInts(-1, 2);
        assertTrue(testValue == -1);
    }

    @Test
    public void shouldReturnNegativeOneForBadB()
    {
        int testValue = adder.AddPositiveInts(1, -1);
        assertTrue(testValue == -1);
    }

    @Test
    public void failingTest()
    {
        assertTrue(false);
    }
}
