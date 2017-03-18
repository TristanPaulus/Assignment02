//N.B!!!!!


//The Gun and GunTest classes apply to Question 2 ONLY

package com.cput.tristan;

import junit.framework.TestCase;


public class GunTest extends TestCase {

    public void testSwitchSafetyOff()
    {
        Gun ak47 = new Gun();
        ak47.switchSafetyOff();
        assertFalse(ak47.getSafetyOn());
    }

    public void testReload()
    {
        Gun ak47 = new Gun();
        ak47.reload();
        assertEquals(2, ak47.getMagazines());
    }

    public void testFire()
    {
        Gun ak47 = new Gun();
        ak47.fire();
        assertEquals(0, ak47.getBullets());
    }

    public void testSHOOTEMALL()
    {
        Gun ak47 = new Gun();
        ak47.SHOOTEMALL();
        assertEquals(0, ak47.getBullets());
        assertEquals(0, ak47.getMagazines());
        assertFalse(ak47.getSafetyOn());
    }

}