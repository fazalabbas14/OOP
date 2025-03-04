package main;
import banking.BankingSystem;
public class BankApplication{
	
	public static void main(String args[]){
		BankingSystem bank=new BankingSystem();

		if(BankingSystem.check==true){
			System.out.println("Verification successful!");
		}
		else{
			System.out.println("Verfication failed!!!");
			System.exit(1);
		}
	}

}
