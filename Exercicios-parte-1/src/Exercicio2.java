import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, resultado;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		resultado = pi * Math.pow(raio, 2);
		
		System.out.printf("Valor da área = %.4f%n", resultado);
		
		sc.close();

	}

}
