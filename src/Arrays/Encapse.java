package Arrays;

import java.util.Scanner;

class information{
	private String Name;
	private int  Age;
	private String Country;
	
	// Getter and setter methods
	public int getEmpAge() {
		return Age;
	}
	public String getEmpName() {
		return Name;
	}
	public String getEmpCountry() {
		return Country;
	}
	public void setEmpAge(int newValue) {
		Age = newValue;
	}
	public void setEmpName(String newValue) {
		Name = newValue;
	}
	public void setEmpCountry(String newValue) {
		Country = newValue;
	}
}

	
public class Encapse {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Name: ");
	  String Name = s.nextLine();
	  System.out.print("Age: ");
	  int Age=  s.nextInt();
	  System.out.print("Country: ");
	  String Country = s.next();
	  information obj = new information();
	  obj.setEmpName(Name);
	  obj.setEmpAge(Age);
	  obj.setEmpCountry(Country);
	  System.out.print("Name: "+obj.getEmpName());
		System.out.print("Age: "+obj.getEmpAge());
		System.out.print("Country: "+obj.getEmpCountry());

	}

}
