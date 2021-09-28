package bank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int opt;
        double balance = 0;
        
        do{
        System.out.println("Bank Account Tracker");
        System.out.print("[1]Balance ");
        System.out.print("[2]Deposit ");
        System.out.print("[3]Withdraw ");
         System.out.println("[0]Quit ");
         System.out.print("Enter option (0-3): ");
         Scanner option = new Scanner (System.in);
         opt = option.nextInt();
         
        switch(opt){
            case 1: 
                System.out.println("Current balance: "+balance);
            break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                Scanner deposit = new Scanner(System.in);
                double dpst = deposit.nextDouble();
                balance = balance + dpst;
            break;  
            case 3:
                System.out.println("Enter amount to withdraw: ");
                Scanner withdraw = new Scanner(System.in);
                double wthdrw = withdraw.nextDouble();
                balance = balance - wthdrw;
            break;
            case 0:
                System.out.println("Closing balance: "+ balance);
            break;
            default: 
                System.out.println("Input error!");
        } //switch case
        } while(opt <=3 && opt>0);    
    }
}