import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		}
		else {
			System.out.println("não são multiplos");
		}
		
		sc.close();

	}

}
