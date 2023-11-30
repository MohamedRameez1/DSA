package Arrays;

import java.util.Scanner;

class Details{
	private String Account;
	private float Balance;
	
public String getEmpAccount() {
	return Account;
}
	public float getEmpBalance() {
		return Balance;
	}
	public void setEmpAccount(String newValue){
		Account = newValue;
	}
	public void setEmpBalance(float newValue) {
	
	   Balance = newValue;
	}

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Account number: ");
		String Account =s.next();
		System.out.print("Balance: ");
		float Balance =s.nextFloat();
		Details obj =new Details();
		obj.setEmpAccount(Account);
		obj.setEmpBalance(Balance);
		System.out.print("Account: "+obj.getEmpAccount());
		System.out.print("Balance: "+obj.getEmpBalance());
	}
		

	}

}
