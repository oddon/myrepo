package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @java.lang.Override
    public Temperature toCelsius() {
        return new Celsius(super.value);
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(super.value * 9 / 5 + 32);
    }

    public String toString()
        {
            // TODO: Complete this method
            return "" + super.value + " C";
        }
}
