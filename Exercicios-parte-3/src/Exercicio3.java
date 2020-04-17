import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int cod;
		
		cod = sc.nextInt();
		
		while (cod != 4) {
			
			switch (cod) {
				case 1:
					alcool = alcool + 1;
					break;
				case 2:
					gasolina = gasolina + 1;
					break;
				case 3:
					diesel = diesel + 1;
					break;
				default:
					System.out.println("Código invalido");
			}
			
			cod = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
