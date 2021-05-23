import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args)
	{
		int resp;
		System.out.println("             Welcome to AriGeomFi Calculator!\n"+"                   created by: ᜁᜇ̵᜔ᜇ̵ᜓᜎ᜔\n                        •console•");
		
		System.out.print("\nEnter your name: ");
		Scanner k = new Scanner(System.in);
		String kk = k.nextLine();
		System.out.println("\nHello "+kk+"! \nThis calculator is only for one unknown to solve.");
		System.out.println("\nDo you want to proceed anyway?\nIf yes, enter any number keys. If no, enter 0.");
		Scanner anyway = new Scanner(System.in);
		int wayany =anyway.nextInt();
		while(wayany!=0){
		do
		{
	  System.out.println("\nSelect your calculator:\nChoose letter (ex. A)\n"+"Note: Enter any [number keys] if you want to try the other calculator.\n");
	  
	  System.out.println("A. Arithmetic Sequence");
	  System.out.println("B. Arithmetic Series");
	  System.out.println("C. Geometric Sequence");
	  System.out.println("D. Geometric Series");
	  System.out.println("E. Fibonnaci Sequence\n\nType capital letter: (ex. A)");
	  
	  Scanner s = new Scanner(System.in);
	  String button = s.nextLine();
	  
	  switch(button)
	  {
	  	//arithmetic sequence
	  	case "A":
	  	System.out.println("\nArithmetic Sequence:");
	  	System.out.println("a. Find [nth] term");
	  	System.out.println("b. Find the common difference");
	  	System.out.println("c. Find term position [n]");
	  	System.out.println("d. Print arithmetic sequence from [1st] term to [nth] term\n");
	  	System.out.println("Type small letter :(ex. a)");
	  	//select from the option of ari.seq
	  	Scanner ari = new Scanner(System.in);
	  	String th = ari.nextLine();
	  	
	  	
	  	switch(th)
	  	{
	  		case "a": 
	  		System.out.println("\nLet us  calculate the [nth] term...");
	  		//1st term
	  		System.out.print("Enter first term: ");
	  		Scanner cath = new Scanner(System.in);
	  		double santos = cath.nextDouble();
	  	
	  			//term position (n)
	  		System.out.print("Enter [n] term position: ");
	  		Scanner janah = new Scanner(System.in);
	  		double abucay = janah.nextDouble(); 	 
	  		
	  		//common difference 
	  		System.out.print("Enter common difference: ");
	  		Scanner alcantara = new Scanner(System.in);
	  		double alyssa = alcantara.nextDouble();	
	  		//calculate now
	  		
	  		double result = santos+(abucay-1)*alyssa;
	  		System.out.println("Answer: "+result);	  
	  		break;
	  	
	  		case "b":
	  		{
	  		System.out.println("\nLet's calculate the common difference...");
	  		
	  		//first term case b
	  		System.out.print("Enter first term: ");
	  		Scanner freddy = new Scanner(System.in);
	  		double aguilar = freddy.nextDouble();
	  		
	  		//term nth case b
	  		
	  		System.out.print("Enter [nth] term: ");
	  		Scanner paulo = new Scanner(System.in);
	  		double antonio = paulo.nextDouble(); 
	  		
	  		//number in position 
	  		System.out.print("Enter [n] number position:");
	  		Scanner balbuena = new Scanner(System.in);
	  		double ramon = balbuena.nextDouble();
	  		
	  		//calculate now
	  	double x=(aguilar-antonio)/-(ramon-1);
	  		
	  		System.out.println("ANSWER: "+x);
	  		}
	  	break;	
	  	case "c":
	  	{
	  			//1st term c
	  		System.out.println("\nLet's calculate the [n] term position...");
	  		System.out.print("Enter first term: ");
	  		Scanner carmina = new Scanner(System.in);
	  		double arce = carmina.nextDouble();
	  		
	  			//term nth case c
	  		System.out.print("Enter [nth] term: ");
	  		Scanner pia = new Scanner(System.in);
	  		double earn = pia.nextDouble(); 
	  		
	  		//common difference c
	  		System.out.print("Enter common difference: ");
	  		Scanner moira = new Scanner(System.in);
	  		double delatorre = moira.nextDouble();	
	  	
	  			//calculate now
	  			double n= (arce+earn)/delatorre;
	  			double clitz = n-1;
	  			System.out.println("ANSWER: "+clitz);
	  				
	  	}
	  		
	  	break;				
	  	case "d":
	  	{
	  		System.out.println("\nLet's print arithmetic sequence from 1st term to nth term...");
	  		System.out.print("Enter first term: ");
	  		Scanner carmela = new Scanner(System.in);
	  		double mercado = carmela.nextDouble();
	  		
	  		System.out.print("Enter last term: ");
	  		Scanner alex = new Scanner(System.in);
	  		double bustam = alex.nextDouble();
	  	for(double x = mercado; x<=bustam; x++ )
	  	{ 
	  	System.out.print(""+x+" ");
	  	}
	  	} //bakod case d
	  	
	    } //bakod case A
	   
	   
	    break; 
	   
	    
	    case "B":
	    {
	    	System.out.println("\nArithmetic Series:");
	  	System.out.println("e. Find the first term of A(series)");
	  	System.out.println("f. Find the last term of A(series)");
	  	System.out.println("g. Find term position [n]");
	  	System.out.println("h. Find the sum of A(sequence)");
	  	System.out.println("\nType small letter :(ex. e) ");
	  	//select from the option of ari.seq
	  	Scanner arianne = new Scanner(System.in);
	  	String rh = arianne.nextLine();
	  	
	  	switch(rh)
	  	{
	  		case "e":
	  		//last term e
	  		System.out.println("\nFind the first term of A(series)... ");
	  			System.out.print("Enter last term: ");
	  		Scanner leny = new Scanner(System.in);
	  		double robredo = leny.nextDouble();
	  		
	  		//n term position
	  			System.out.print("Enter [n] term position: ");
	  		Scanner elton = new Scanner(System.in);
	  		double coco = elton.nextDouble();
	  		
	  		//sum 
	  			System.out.print("Enter sum: ");
	  		Scanner wenang = new Scanner(System.in);
	  		double mawi = wenang.nextDouble();
	  		// compute first term
	  		//  1st = (n/2 * last - sum)/ -n/2
	  		// 
	  		
	  		double y = (coco/2 * robredo -mawi)/ (-coco/2);
	  		System.out.println("ANSWER: "+y);
	  		
	  		break;
	  		case "f":
	  		
	  			//first term e
	  		System.out.println("\nFind the last term of A(series)... ");
	  			System.out.print("Enter first term: ");
	  		Scanner lili = new Scanner(System.in);
	  		double maw = lili.nextDouble();
	  		
	  		//n term position
	  			System.out.print("Enter [n] term position: ");
	  		Scanner grace = new Scanner(System.in);
	  		double celle = grace.nextDouble();
	  		
	  		//sum 
	  			System.out.print("Enter sum: ");
	  		Scanner sam = new Scanner(System.in);
	  		double nicole = sam.nextDouble();
	  		
	  		// compute last term
	  		// sum = n/2*1st + n/2*last
	  		// - n/2*last = n/2*1st - sum
	  		double d = (celle/2*maw-nicole)/(-celle/2);
	  		System.out.println("ANSWER: "+d);
	  	break;	
	  	
	  	case "g": 
	  	{
	  		System.out.println("\nLet's calculate the [n] term position");
	  		
	  		//first term 
	  			System.out.print("Enter first term: ");
	  		Scanner kiki = new Scanner(System.in);
	  		double doyu = kiki.nextDouble();
	  		
	  		//last term
	  			System.out.print("Enter last term: ");
	  		Scanner pipi = new Scanner(System.in);
	  		double loveme = pipi.nextDouble();	
	  		//sum 
	  			System.out.print("Enter sum: ");
	  		Scanner life = new Scanner(System.in);
	  		double longga = life.nextDouble();
	  		
	  		//calculate n term position
	  		//sum=n/2(1st + last)
	  		//n = 2(sum)/(1st + last)
	  		double kaki = 2*longga/(doyu+loveme);
	  		System.out.println("Answer: "+kaki);	
	  		break;
	  	}
	  	
	  	case "h":
	  	{
	  		System.out.println("\nSum of the arithmetic sequence");
	  	
	  		//first term 
	  			System.out.print("Enter first term: ");
	  		Scanner kikit = new Scanner(System.in);
	  		double doyut = kikit.nextDouble();
	  		
	  		//last term
	  			System.out.print("Enter last term: ");
	  		Scanner pipit = new Scanner(System.in);
	  		double lovemet = pipit.nextDouble();
	  		
	  		//n term position
	  			System.out.print("Enter [n] term position: ");
	  		Scanner lifet = new Scanner(System.in);
	  		double longgat = lifet.nextDouble();
	  		
	  		//calculate now
	  		double helena = (lovemet+doyut)*(longgat/2);
	  		System.out.println("ANSWER: "+helena);
	  	break;
	  	}
	  	}//switch (rh)
	    }//case B 
	    
	    case "C":
	  	{
	  			System.out.println("\nGeometric Sequence:");
	  	System.out.println("i. Find [nth] term");
	  	System.out.println("j. Find the common ratio");
	  	System.out.println("k. Find term position [n]");
	  	System.out.println("l. Find the first term");
	  		System.out.println("\nType small letter (ex. i)");
	  		Scanner april = new Scanner(System.in);
	  		String may = april.nextLine();
	  	
	  		
	  		switch(may)
	  		{
	  			case "i":
	  			{
	  			System.out.println("\nLet's find the [nth] term...");
	  			//first term
	  			System.out.print("Enter first term: ");
	  Scanner ella = new Scanner(System.in);
	 double mella = ella.nextDouble();
	  		//common ratio
	  		System.out.print("Enter common ratio: ");
Scanner ratio1 = new Scanner(System.in);
	  double mama1 = ratio1.nextDouble();
	  		//[n] position
	  		System.out.print("Enter [n] position: ");
 Scanner dadi = new Scanner(System.in);
	  			double dadi1 = dadi.nextDouble();
	  			//calculate now the nth term
	  	       //nth = a*r ^(n-1)
	  	double meng =  mella * Math.pow(mama1,dadi1-1);
	  	System.out.println("ANSWER: "+meng);
	  		break;
	  		} // bakod case i
	  		
	  		case "j":
	  		{
	  			System.out.println("\nLet's find the common ratio...");
	  			//first term
	  			System.out.print("Enter first term: ");
	  Scanner span = new Scanner(System.in);
	 double ish = span.nextDouble();
	  		//nth term
	  		System.out.print("Enter [nth] term: ");
Scanner ameri = new Scanner(System.in);
	  double ca = ameri.nextDouble();
	  
	  		//[n] position
	  		System.out.print("Enter [n] position: ");
 Scanner fili = new Scanner(System.in);
	  			double pino = fili.nextDouble();
	  		// calculate now
	  		// nth = 1st * r^(n-1)
	  		// r= (n-1) root (nth/1st)
	 	// reb = Math.pow(ca/ish, 1/(pino-1)
	   double reb = ca/ish;
	   double ber = 1/(pino-1);
	   double rebber = Math.pow(reb, ber);
	   System.out.println("ANSWER: "+rebber);
	  		break;
	  		}//bakod case j
	  			
	  		case "k":
	  		{
	  			System.out.println("\nLet's find the [n] term position...");
	  			//first term
	  			System.out.print("Enter first term: ");
	  Scanner xa = new Scanner(System.in);
	 double xe = xa.nextDouble();
	  		//common ratio
	  		System.out.print("Enter common ratio: ");
Scanner damn = new Scanner(System.in);
	  double you = damn.nextDouble();
	  
	  		//[nth] number:
	  		System.out.print("Enter [nth] term: ");
 Scanner lumot = new Scanner(System.in);
	  			double baboy = lumot.nextDouble();
	  			//calculate [n] term  position
	  		// nth = 1st * r^(n-1)
	  		// nth/1st = r^(n-1)
	  		// log nth/1st = (n-1) log r
	  		// (log nth/1st)/log r = n-1
	  		// 1+ (log nth/1st)/log r = n
	  		// n = 1+ (log nth/1st)/log r ;
// double year = 1 + (Math.log baboy/xe)/(Math.log(you);
double year = 1 + (Math.log(baboy/xe))/(Math.log(you));
System.out.printf("ANSWER: %.0f\n",year);
	  		
	  		break;
	  		} // bakod case k
	  		
	  		case "l":
	  		{
	  		
	  	System.out.println("\nLet's find the first term...");
	  			//[n] term
	  			System.out.print("Enter [n] term: position: ");
	  Scanner xax = new Scanner(System.in);
	 double xex = xax.nextDouble();
	  		//common ratio
	  		System.out.print("Enter common ratio: ");
Scanner damnk = new Scanner(System.in);
	  double youk = damnk.nextDouble();
	  
	  		//[nth] number:
	  		System.out.print("Enter [nth] number position: ");
	  		Scanner damnki = new Scanner(System.in);
	  double youki = damnki.nextDouble();
	  		//calculate now
	  		// 1st* r^(n-1) = nth
	  		// 1st = nth * r^(1-n)
	  		// ter = damnki * Math.pow(youk, 1-xax)
	  		double ter = youki*Math.pow(youk,1-xex);
	  		System.out.println("ANSWER: "+ter);
	  		}//bakod case l;
	  		} //bakod switch(may)
	  	} //bakod case C  
	  break; 
	  
	  case "D":
	  {
	  		System.out.println("\nGeometric Series:");
	  	System.out.println("m. Find the sum of the finite geometric sequence: ");
	  	System.out.println("n. Find the sum of infinite geometric sequence. |ratio|<1 ");
	  	
	  		System.out.println("\nType small letter (ex. m)");
	  		Scanner aug = new Scanner(System.in);
	  		String sep = aug.nextLine();
	  		
	  switch(sep)
	  {
	  	case "m":
	  	{
	  	System.out.println("\nLet's find the sum of finite geometric sequence... ");
	  	//first term
	  	System.out.print("Enter first term: ");
	  	Scanner go = new Scanner(System.in);
	  	double grow = go.nextDouble();
	  	//common ratio
	  	System.out.print("Enter common ratio: ");
	  	Scanner glow = new Scanner(System.in);
	  	double glower = glow.nextDouble();
	  
	  		//n term position
	  	System.out.print("Enter [n] term position: ");
	  	Scanner glows = new Scanner(System.in);
	  	double glowers = glows.nextDouble();
	  
	  		// compute now
	  	double gulay = grow * ((Math.pow(glower,glowers)-1)/(glower-1));
	  	System.out.println("ANSWER: "+gulay);
	  	
	  }//bakod case m
	  
	  case "n":
	  {
	  	System.out.println("\nLet's find the sum of infinite geometric sequence... ");
	  	//first term
	  	System.out.print("Enter first term: ");
	  	Scanner gos = new Scanner(System.in);
	  	double grows = gos.nextDouble();
	  
	  	//common ratio
	  	System.out.print("Enter common ratio: ");
	  	Scanner kirk = new Scanner(System.in);
	  	double kirks = kirk.nextDouble();
	  	
	  	//computenow
	  	double dedee = grows/(1-kirks);
	  	System.out.println("ANSWER: "+dedee);
	  	
	  }//bakod case n
	  }// switch(sep)
	  } //case D
	  
	  case "E":
	  {
	  		System.out.println("\nFibonacci Sequence:");
	  	System.out.println("o. Find the nth term of fibonacci (as F0 = 0, F1 = 1) ");
	  	System.out.println("p. Print fibonacci sequence: ");
	  	
	  		System.out.println("\nType small letter (ex. o)");
	  		Scanner dec = new Scanner(System.in);
	  		String jan = dec.nextLine();
	  		
	  		switch(jan)
	  		{
	  			case "o":
	  			{
	  				System.out.println("\nLet's find the nth term of fibonacci sequence: ");
	  					System.out.print("Enter [n] term position: ");
	  	Scanner bb = new Scanner(System.in);
	  	double bbs = bb.nextDouble();
	  	
	  //compute now
	  double mnl = Math.pow((1+Math.sqrt(5)),bbs);
	  double qc = mnl - Math.pow((1-Math.sqrt(5)),bbs);
	  double sj =Math.pow(2,bbs)*Math.sqrt(5);
	  double marikina = qc/sj;
	  System.out.printf("ANSWER: %.0f\n",marikina);
	  			}//case o
	  		}//switch(jan)
	  		
	  	
	  	
	  	
	  	
	  }//case E 
	  	
	  	
	  	
	  
	  
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	    //-------okay na tong baba wag na galawin;
	    
	    
	    
	   }//switch (button)
	   	System.out.println("\nDo you want to try again?\nIF YES, TYPE any [number]. If no, type 0.");
	   
	   Scanner wawi = new Scanner(System.in);
	    resp=wawi.nextInt();
		}while(resp!=0);
		
		System.out.print("\nBefore you leave, rate this program\n(10 = highest : 1 = lowest)\nRate here: ");
		
Scanner rate = new Scanner(System.in);
int rateme= rate.nextInt();
if(rateme>=7)
{
	System.out.println("\nRATING: PASSED");
	break;
}else
{
	System.out.println("\nRATING: FAILED");
	int now;
	do{
	System.out.print("\nSend any suggestions to improve this program:"+"\nTYPE HERE: ");
	Scanner prog = new Scanner(System.in);
	String ram = prog.nextLine();
	System.out.println("\nAre you sure to submit this message?\nTo retype, enter any [number keys].\nEnter 0 to submit and end this program.");
	
	Scanner hey = new Scanner (System.in);
	now = hey.nextInt();
	
	}while(now!=0);

	System.out.println("\nYour message is recorded.");
	break;
}
		}
System.out.println("Salamat sa paggamit ng program "+kk+", mabuhay ka! ");
		
// main class bracket
		}
}