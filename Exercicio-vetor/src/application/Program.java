package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vRoom = new String[10];
		System.out.println("NUMERO DE ESTUDANTES");
		int num = sc.nextInt();
		
		Student[] student = new Student[num];
		
		for (int i = 0; i < student.length; i++) {
			sc.nextLine();
			System.out.println("NOME");
			String name = sc.nextLine();
			System.out.println("EMAIL");
			String email = sc.nextLine();
			System.out.println("ROOM");
			int room = sc.nextInt();
			student[i] = new Student(name, email, room);
			vRoom[student[i].getRoom()] = student[i].getName() + ", " + student[i].getEmail();
		}
		
		for (int i = 0; i < vRoom.length; i++) {
			if (vRoom[i] != null) {
				System.out.println(i + ": " + vRoom[i]);
			}
		}
		
		
		sc.close();

	}

}
