//area of trapezoid
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Area of Trapezoid");
		double area;
		double height;
		double base1;
		double base2;
		
		height = getHeight();
		base1= getBase1();
		base2 = getBase2();
		area = getArea(height, base1, base2);
		displayMessage(area);
	}
	// 
	public static double getHeight()
	{
		System.out.print("Height:");
		Scanner s = new Scanner(System.in);
		double result = s.nextDouble();
		return result; 
	}
	public static double getBase1()
	{
		System.out.print("Base1:");
		Scanner d = new Scanner(System.in);
		double result = d.nextDouble();
		return result;
	}
	public static double getBase2()
	{
		System.out.print("Base2:");
		Scanner f = new Scanner(System.in);
		double result = f.nextDouble();
		return result; 
	}
	public static double getArea(double height, double base1, double base2)
	{
		double result = ((base1+base2)*height)/2;
		return result;
	}
	
	public static void displayMessage(double area)
	{
		System.out.println("Area = "+area);
	}
}