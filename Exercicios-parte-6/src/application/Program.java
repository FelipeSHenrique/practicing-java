package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		if (student.noteFinal() > 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", student.noteFinal());
		}
		else {
			System.out.printf("FINAL GRADE = " + student.noteFinal() + "\nFAILED \nMISSING " + student.missingPoints() + " POINTS");
		}
		
		sc.close();
		
	}

}
