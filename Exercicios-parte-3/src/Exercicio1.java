import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int dig_senha;
		
		dig_senha = sc.nextInt();
		
		while (dig_senha != senha) {
			System.out.println("Senha Invalida");
			dig_senha = sc.nextInt();	
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
