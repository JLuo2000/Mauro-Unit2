//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public void calcQuadratic()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a : : ");
		a = input.nextInt();
		System.out.println("Enter b : : ");
		b = input.nextInt();
		System.out.println("Enter c : : ");
		c = input.nextInt();
		
		calcRoots();
		print();
		
	}

	/*public Quadratic(int quadA, int quadB, int quadC)
	{
		

	}*/

	public void setEquation(int quadA, int quadB, int quadC)
	{
		

 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.sqrt(Math.pow(b, 2.0)-4.0*a*c))/(2.0*a);
		rootTwo = (-b - Math.sqrt(Math.pow(b, 2.0)-4.0*a*c))/(2.0*a);

	}

	public void print( )
	{
		System.out.println("root one = " + rootOne);
		System.out.println("Root two = " + rootTwo);
	}
}