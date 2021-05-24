limport java.util.Scanner;

public class Sorting{
	public static void main(String args[]){
		String k;

		Scanner s = new Scanner(System.in);
		System.out.println("How many names do you want to alphabetically arrange?");

		//store value for n
		int n;
		n=s.nextInt();
		s.nextLine();

		//store corresponding (n value) to (n string names)
		System.out.print("Enter the "+n+" names:");
		String names[] = new String[n];

		for(int x=0; x<n; x++)
			{
			System.out.println(" ");
			names[x]=s.nextLine();
			}

		//start sorting
		for(int x=0; x<n; x++)
			{
			for(int y=1; y<n; y++)
				{
				if(names[y-1].compareTo(names[y])>0)
					{
					k=names[y-1];
					names[y-1]=names[y];
					names[y]=k;

					}
				}
			}
			System.out.println("\nRESULTS:\n");
			//print out the results
			for(int x=0; x<n; x++)
			{
				System.out.println(names[x]);
			}



	}
}