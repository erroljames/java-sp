//determining the gwa
import java.util.Scanner;

public class gwa{
public static void main(String[] args){

//declare var
String name;
String a,b,c,d,e,f,g,h;
String i,j,k,l,m,n,o;
double as, bs, cs, ds,es,fs,gs,hs,is,js,ks,ls,ms,ns,os;
double g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12;
double gwa;
double A, B, C, D, E, F, G, H, I, J, K, L, M;

System.out.println("Welcome to GWA CALCULATOR!\n");
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter your name:");
name = keyboard.nextLine();
System.out.println(" \n");


///------------
Scanner p = new Scanner(System.in);
System.out.println("COMPUTE YOUR GRADES (max. 12 subjects)");
System.out.println("Note: No subject = enter 0\n      No grade = enter 0\n");


//--------------------------------------------------first
System.out.println("Enter your 1st subject name:");
a=p.nextLine();
System.out.println("Grade in "+a+" subject:");
as=p.nextDouble();

if(as!=0){
	Scanner BA = new Scanner(System.in);
	System.out.println("No. of units");
g1=BA.nextInt();
}else{
g1=0;}
A = as*g1;
//-------------------------------------------------second
System.out.println(" \n");
Scanner q =new Scanner(System.in);

System.out.println("Enter your 2nd subject name:");
b=q.nextLine();
System.out.println("Grade in "+b+" subject:");
bs=q.nextDouble();

if(bs!=0){
	Scanner BE = new Scanner(System.in);
	System.out.println("No. of units");
g2=BE.nextInt();
}else{
g2=0;}
B = bs*g2;
//---------------------------------------------------third
System.out.println(" \n");
Scanner r =new Scanner(System.in);

System.out.println("Enter your 3rd subject name:");
c=r.nextLine();
System.out.println("Grade in "+c +" subject:");
cs=r.nextDouble();

if(cs!=0){
	Scanner BI = new Scanner(System.in);
	System.out.println("No. of units");
g3=BI.nextInt();
}else{
g3=0;}
C = cs*g3;
//----------------------------------------------------fourth
System.out.println(" \n");
Scanner s =new Scanner(System.in);

System.out.println("Enter your 4th subject name:");
d=s.nextLine();
System.out.println("Grade in "+d+" subject:");
ds=s.nextDouble();

if(ds!=0){
	Scanner BO = new Scanner(System.in);
	System.out.println("No. of units");
g4=BO.nextInt();
}else{
g4=0;}
D = ds*g4;
//-----------------------------------------------------fifth
System.out.println(" \n");
Scanner t =new Scanner(System.in);

System.out.println("Enter your 5th subject name:");
e=t.nextLine();
System.out.println("Grade in "+e+" subject:");
es=t.nextDouble();
if(es!=0){
	Scanner BU = new Scanner(System.in);
	System.out.println("No. of units");
g5=BU.nextInt();
}else{
g5=0;}
E = es*g5;
//-------------------------------------------------------sixth
System.out.println(" \n");
Scanner u =new Scanner(System.in);

System.out.println("Enter your 6th subject name:");
f=u.nextLine();
System.out.println("Grade in "+f+" subject:");
fs=u.nextDouble();
if(fs!=0){
	Scanner CA = new Scanner(System.in);
	System.out.println("No. of units");
g6=CA.nextInt();
}else{
g6=0;}
F = fs*g6;
//----------------------------------------------------seventh
System.out.println(" \n");
Scanner v =new Scanner(System.in);

System.out.println("Enter your 7th subject name:");
g=v.nextLine();
System.out.println("Grade in "+g+" subject:");
gs=v.nextDouble();
if(gs!=0){
	Scanner CE = new Scanner(System.in);
	System.out.println("No. of units");
g7=CE.nextInt();
}else{
g7=0;}
G = gs*g7;
//----------------------------------------------------eight
System.out.println(" \n");
Scanner w =new Scanner(System.in);

System.out.println("Enter your 8th subject name:");
h=w.nextLine();
System.out.println("Grade in "+h+" subject:");
hs=w.nextDouble();
if(hs!=0){
	Scanner CI = new Scanner(System.in);
	System.out.println("No. of units");
g8=CI.nextInt();
}else{
g8=0;}
H = gs*g8;
//---------------------------------------------------ninth
System.out.println(" \n");
Scanner x =new Scanner(System.in);

System.out.println("Enter your 9th subject name:");
i=x.nextLine();
System.out.println("Grade in "+i+" subject:");
is=x.nextDouble();

if(is!=0){
	Scanner CO = new Scanner(System.in);
	System.out.println("No. of units");
g9=CO.nextInt();
}else{
g9=0;}
I = is*g9;
//-----------------------------------------------------tenth
System.out.println(" \n");
Scanner y =new Scanner(System.in);

System.out.println("Enter your 10th subject name:");
j=y.nextLine();
System.out.println("Grade in "+j+" subject:");
js=y.nextDouble();
if(js!=0){
	Scanner CU = new Scanner(System.in);
	System.out.println("No. of units");
g10=CU.nextInt();
}else{
g10=0;}
J = js*g10;
//------------------------------------------------------eleventh
System.out.println(" \n");
Scanner z =new Scanner(System.in);

System.out.println("Enter your 11th subject name:");
k=z.nextLine();
System.out.println("Grade in "+k+" subject:");
ks=z.nextDouble();

if (ks!=0){
	Scanner DA = new Scanner(System.in);
	System.out.println("No. of units");
g11=DA.nextInt();
}else{
g11=0;}
K = ks*g11;
//---------------------------------------------------------twelveth
System.out.println(" \n");
Scanner ad =new Scanner(System.in);

System.out.println("Enter your 12th subject name:");
l=ad.nextLine();
System.out.println("Grade in "+l+" subject:");
ls=ad.nextDouble();

if(ls!=0){
	Scanner DE = new Scanner(System.in);
	System.out.println("No. of units");
g12=DE.nextInt();
}else{
g12=0;}
L = ls*g12;
//--------------------------------------------
//process accumulated weight over sum of units

double N;
 N=g1+g2+g3+g4+g5+g6+g7+g8+g9+g10+g11+g12;
 //compute gwa
gwa=(A+B+C+D+E+F+G+H+I+J+K+L)/N;

//print out grades and subjects
System.out.println(" \n");

System.out.println(" "+a+" ("+g1+")unit/s: "+as);
System.out.println(" "+b+" ("+g2+")unit/s: "+bs);
System.out.println(" "+c+" ("+g3+")unit/s: "+cs);
System.out.println(" "+d+" ("+g4+")unit/s: "+ds);
System.out.println(" "+e+" ("+g5+")unit/s: "+es);
System.out.println(" "+f+" ("+g6+")unit/s: "+fs);
System.out.println(" "+g+" ("+g7+")unit/s: "+gs);
System.out.println(" "+h+" ("+g8+")unit/s: "+hs);
System.out.println(" "+i+" ("+g9+")unit/s: "+is);
System.out.println(" "+j+" ("+g10+")unit/s: "+js);
System.out.println(" "+k+" ("+g11+")unit/s: "+ks);
System.out.println(" "+l+" ("+g12+")unit/s: "+ls);

//print gwa

System.out.println(" \n");
System.out.println("RESULT:Hello! Your GWA is "+gwa+);
System.out.println(" \n");
System.out.println("Mag-aral ng mabuti para ang buhay ay mapabuti!");
System.out.println("Salamat sa paggamit ng program, "+name+"!\n");
}}

