//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	private static int a, b, c, d;

	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter X1 : : ");
		a = input.nextInt();
		System.out.println("Enter Y1 : : ");
		b = input.nextInt();
		System.out.println("Enter X2 : : ");
		c = input.nextInt();
		System.out.println("Enter Y2 : : ");
		d = input.nextInt();
		
		Distance calc = new Distance();
		calc.Distance(a,b,c,d);
		
		
			
	}
}