package com.cput.tristan;

import junit.framework.TestCase;
import java.util.Timer;

/**
 * Created by Tristan on 2017/03/18.
 */
public class CarTest extends TestCase {

    public void testAdd500Kilos() throws Exception
    {
        //Tests comparison of floats (Made double to cater for size)
        //Question 1.i
        Car skyline = new Car(1400.0, 0, 330, 40, "Nissan Skyline R35", false);
        skyline.add500Kilos();
        assertEquals(1900.0, skyline.getWeight());
    }

    public void testZeroToSixty() throws Exception
    {
        //Tests comparison of ints
        //Question 1.ii
        int actual;
        Car skyline = new Car(1400.0, 0, 330, 40, "Nissan Skyline R35", false);
        actual = skyline.zeroToSixty();
        assertEquals(2, actual);
    }

    public void testCarEquality() throws Exception
    {
        //Tests for object equality
        //Question 1.iii
        Car skyline = new Car(1400.0, 0, 330, 40, "Nissan Skyline R35", false);
        Car porsche = new Car(1400.0, 0, 330, 40, "Nissan Skyline R35", false);

        //assertEquals(skyline, porsche);
        assertTrue(Car.carEquality(skyline, porsche));

        //Tests for object identity
        //Question 1.iv
        Car skyline1 = skyline;
        assertSame(skyline, skyline1);
    }

    public void testSetSecondHand() throws Exception
    {
        //Tests for Truth
        //Question 1.v
        Car golf = new Car(900.0, 0, 180, 20, "Citi Golf", true);
        assertTrue(golf.getSecondHand());

        //Tests for False
        //Question 1.vi
        golf.setSecondHand(false);
        assertFalse(golf.getSecondHand());
    }

    public void testCar() throws Exception
    {
        Car nullCar = new Car();

        //Tests for not Nullness
        //Question 1.viii
        assertNotNull(nullCar);

        //Tests for Nullness
        //Question 1.vii
        nullCar = null;
        assertNull(nullCar);

    }

    public void testFail() throws Exception
    {
        //Question 1.ix
        fail("This method is meant to fail");
    }

}