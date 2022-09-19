import java.math.BigDecimal;


public class Power10
{
    private double number;
    private int power;

    public Power10(double number)
    {
        this.number = number;
        this.power = setPower();
    }
    
    public Power10(double number, int power)
    {
        this.number = number;
        this.power = power;
    }

    public String getEquation()
    {
        return number + " * 10^" + this.getPower();
    }

    public int setPower()
    {
        double i = 0.0;
        String numberString = String.valueOf(this.number);
        
        while (Double.parseDouble(numberString) > 10)
        {
            numberString = String.valueOf(Double.parseDouble(numberString) / 10);
            i++;
        }
    
        this.number = Double.parseDouble(numberString);
        
        return (int)i;
    }

    public int getPower()
    {
        return this.power;
    }

    public double getNumber()
    {
        return number * Math.pow(10,power);
    }

    public double getBigNumber()
    {
        double value = 10.0;
        
        for (int i = 2; i <= getPower(); i++)
        {
            value = value * 10.0;
        }
        
        return value * this.number;
    }

    
    public String toString()
    {
        return "Value: " + String.valueOf(number) + " or " + new BigDecimal(this.getBigNumber()).toBigInteger() +
               "\nEquation: " + getEquation();
    }

}