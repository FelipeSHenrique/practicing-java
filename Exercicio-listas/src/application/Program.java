package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de Funcionarios");
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("ID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("NAME");
			String name = sc.nextLine();
			System.out.println("SALARIO");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		int search = sc.nextInt();
		
		Employee result = list.stream().filter(x -> x.getId() == search).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("id não existe");
		} else {
			System.out.println("Digite uma porcentagem");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("lista de empregados:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
	
		sc.close();
		
	}

}
