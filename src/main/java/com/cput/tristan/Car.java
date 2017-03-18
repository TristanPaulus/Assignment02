package com.cput.tristan;

public class Car
{
    private double weight;
    private int speedometer;
    private int topSpeed;
    private int acceleration;
    private String model;
    private boolean secondHand;

    Car()
    {

    }

    Car(double weight, int speedometer, int topSpeed, int acceleration, String model, boolean secondHand)
    {
        this.weight = weight;
        this.speedometer = speedometer;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.model = model;
        this.secondHand = secondHand;
    }

    public void add500Kilos()
    {
        this.weight += 500;
    }

    public int zeroToSixty()
    {
        int i = 0;
        speedometer = 0;
        while(speedometer < 60)
        {
            i++;
            speedometer += acceleration;
        }

        return i;
    }

    public static boolean carEquality(Car c1, Car c2)
    {
        boolean equal;
        if(c1.getWeight() != c2.getWeight())
            equal = false;
        else
        {
            if(c1.getSpeedometer() != c2.getSpeedometer())
                equal = false;
            else
            {
                if(c1.getTopSpeed() != c2.getTopSpeed())
                    equal = false;
                else
                {
                    if(c1.getAcceleration() != c2.getAcceleration())
                        equal = false;
                    else
                        if (c1.getModel() != c2.getModel())
                            equal = false;
                        else
                            if(c1.getSecondHand() != c2.getSecondHand())
                                equal = false;
                            else
                                equal = true;
                }
            }
        }

        return equal;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getSpeedometer()
    {
        return this.speedometer;
    }

    public void setSpeedometer(int speedometer)
    {
        this.speedometer = speedometer;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public boolean getSecondHand()
    {
        return this.secondHand;
    }

    public void setSecondHand(boolean secondHand)
    {
        this.secondHand = secondHand;
    }

    public int getTopSpeed()
    {
        return topSpeed;
    }

    public int getAcceleration()
    {
        return acceleration;
    }

    public String toString()
    {
        return("Car model: " + model + "\nWeight: " + weight + "kgs \nTop speed: " + speedometer + "km/h \nSecond hand?: " + secondHand);
    }

}
