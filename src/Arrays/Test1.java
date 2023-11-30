package Arrays;

import java.util.Scanner;

class Employee{
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public int getEmpemployee_id() {
		return employee_id;
		}
	public String getEmpemployee_name() {
		return  employee_name;
	}
	public double getEmpemployee_salary() {
		return employee_salary;
	}
	public void setEmpemployee_id(int newValue) {
		employee_id = newValue;
	}
	public void setEmpemployee_name(String newValue) {
		employee_name = newValue;
		
	}
	public void setEmpemployee_salary(double newValue) {
		employee_salary = newValue;
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Emplyee details: ");
		  System.out.print("ID: ");
		  int ID =s.nextInt();
		  System.out.print("Name: ");
		  String Name =s.next();
		  System.out.print("Salary: ");
		  double Salary =s.nextDouble();
		  Employee obj = new Employee();
		  obj.setEmpemployee_id(ID);
		  obj.setEmpemployee_name(Name);
		  obj.setEmpemployee_salary(Salary);
		  System.out.println("Emplyee details: ");
		  System.out.println("ID: "+obj.getEmpemployee_id());
		  System.out.println("Name: "+obj.getEmpemployee_name());
		  System.out.println("Salary: "+obj.getEmpemployee_salary());
		  
		  
			  
		  }
}

