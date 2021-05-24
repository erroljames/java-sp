import java.util.Scanner;
public class rectangle{
	public static void main(String[] args)
	{
		double length = getLength();
		double width = getWidth();
		double area = getArea(length,width);
		displayData(area);
	}
	//get length; return to main
	public static double getLength()
	{
		System.out.println("Enter length:");
		Scanner s = new Scanner(System.in);
		double result = s.nextDouble();
		return result;
	}
	//get width; return to main
		public static double getWidth()
	{
		System.out.println("Enter width:");
		Scanner d = new Scanner(System.in);
		double result = d.nextDouble();
		return result;
	}
	//get area; return to main
	public static double getArea(double length, double width)
	{
		double result=length*width;
		return result;
	}
	//display area
	public static void displayData(double area)
	{
		System.out.printf("Rectangle's Area = %.3f",area);
	}
}