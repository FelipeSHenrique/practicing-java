package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println(employee.grossSalary);
		
		sc.close();

	}

}
