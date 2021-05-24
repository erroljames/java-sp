// find the mean
import java.util.Scanner;

public class mean{
	public static void main(String[] args){
		double mean;
		double am, fd, tf, cl;
		double a, b, c, d, e, f,g,h,i, j;
		String name;
		
		Scanner s= new Scanner(System.in);
//compute total frequency
     
       System.out.println("What is your name?");
       name = s.nextLine();
       System.out.println(" \n");
       
         System.out.println("Hello, "+name+"! WELCOME TO MEAN CALCULATOR. \nPlease enter your data below.\n");
        
		System.out.println("Enter your frequency distribution numbers (max. 10 digits)");
		
			a=s.nextDouble();
			b=s.nextDouble();
			c=s.nextDouble();
		    d=s.nextDouble();
		    e=s.nextDouble();
			f=s.nextDouble();
			g=s.nextDouble();
			h=s.nextDouble();
			i=s.nextDouble();
			j=s.nextDouble();
		
	fd=(a+b+c+d+e)+(f+g+h+i+j);
	System.out.println("Your total frequency distribution is " +fd);
		//
			System.out.println(" \n");
								System.out.println("Input your assumed mean");
		am=s.nextDouble();
		
		System.out.println("Input your total frequency");
		tf=s.nextDouble();
		System.out.println("Input your class interval");
		
		cl=s.nextDouble();
		//process
		mean=am+(fd/tf)*cl;
		System.out.println(" \n");
		System.out.printf("RESULT: Hi "+name+ "! Your mean is %.2f \n",mean);
		System.out.println("Thank you for using this program!");
		
	}}