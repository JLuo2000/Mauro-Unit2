//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public void LineCalc(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
		print();

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (yTwo - yOne)/(xTwo-xOne);


	}

	public void print( )
	{	
		calculateSlope();
		System.out.println("The slope is: " + ((Math.round(slope * 100.0))/100.0));


	}
}