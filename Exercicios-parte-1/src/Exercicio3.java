import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Digite o valor A e B");
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println("Digite o valor C e D");
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.println(diferenca);
		
		sc.close();

	}

}
