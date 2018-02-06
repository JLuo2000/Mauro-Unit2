//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setF(double fahren)
	{
		fahrenheit = fahren;
		print();
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit - 32.0)*(5.0/9.0);
		celsius = Math.round(celsius * 100.0)/100.0;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(fahrenheit + " degrees fahrenheit == " + getCelsius() + " degrees Celsius.");
	}
}