import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horasTrabalhadas;
		double salarioHora, salario;
		
		System.out.println("Digite o número do funcionario");
		number = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o salário por hora");
		salarioHora = sc.nextDouble();
		
		salario = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
