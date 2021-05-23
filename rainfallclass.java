import java.util.*;

public class rainfall
{
	public static void main(String[] args) 
	{
	      int totalRain = getTotalRain();
	      
		System.out.println("\nSUM: "+totalRain);
	
	} //main class
	
	public static int getTotalRain()
	{
	 int x;
	 int sum=0;
	 int rainfall[] = new int [12]; //kwarto
	 System.out.println("Enter the vol. of rainfall per month: ");
	  
	  Scanner s = new Scanner(System.in); 
	 for(x=0; x<12; x++)
	 {
	  rainfall [x] = s.nextInt();
	 } // naka-loop yung pag-enter ng values 
	 for (x=0; x<12; x++)
	 {
	 	sum+=rainfall[x];	
	 } // update values kada add
	System.out.println(": "+max(rainfall));
		return sum;
	}// getTotalRain
	
	public static int max(int [] x)
	{
		int temp = x[0]; 
		for(int i=0; i<x.length; i++)
		{
			if(temp < x[i])
			{
				temp=x[i];
			}
		}
		return temp;
	}
	

	
      
      

}