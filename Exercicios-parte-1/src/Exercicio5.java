import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod_peca1, cod_peca2, num_pecas1, num_pecas2;
		double preco_unitario1, preco_unitario2, val_pagar;
		
		System.out.println("PEÇA 1");
		System.out.println("Digite o Código da peça");
		cod_peca1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças");
		num_pecas1 = sc.nextInt();
		System.out.println("Digite o Valor unitario da peça");
		preco_unitario1 = sc.nextDouble();
		
		System.out.println("PEÇA 2");
		System.out.println("Digite o Código da peça");
		cod_peca2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças");
		num_pecas2 = sc.nextInt();
		System.out.println("Digite o Valor unitario da peça");
		preco_unitario2 = sc.nextDouble();
		
		val_pagar = (preco_unitario1 * num_pecas1) + (preco_unitario2 * num_pecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", val_pagar);
		
		sc.close();

	}

}
