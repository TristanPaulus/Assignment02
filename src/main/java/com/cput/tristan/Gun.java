//N.B!!!!!


//The Gun and GunTest classes apply to Question 2 ONLY

package com.cput.tristan;

public class Gun
{
    private int bullets;
    private boolean safetyOn;
    private int magazines;

    Gun()
    {
        bullets = 30;
        safetyOn = true;
        magazines = 3;
    }

    public void switchSafetyOff()
    {
        safetyOn = false;
    }

    public void reload()
    {
        bullets = 30;
        magazines = magazines - 1;
    }

    public void fire()
    {
        while(bullets > 0)
        {
            bullets--;
        }
    }

    public void SHOOTEMALL()
    {
        switchSafetyOff();
        fire();

        while(magazines > 0)
        {
            reload();
            fire();
        }
    }

    public int getBullets()
    {
        return bullets;
    }

    public boolean getSafetyOn()
    {
        return safetyOn;
    }

    public int getMagazines()
    {
        return magazines;
    }

}
