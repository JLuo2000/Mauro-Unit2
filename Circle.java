//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jim Luo
//Date - 2/5/18
//Class - Mauro P1
//Lab  - Area of Circle


public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
		calculateArea();
		print();
	}

	public void calculateArea( )
	{
		area = Math.pow(radius, 2) * Math.PI;
	}

	public void print( )
	{
		System.out.println(area);
	}
}