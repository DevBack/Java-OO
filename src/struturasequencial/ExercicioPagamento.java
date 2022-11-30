package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). 
 * Ao final, mostrar o valor do pagamento do funcionário com uma mensagem explicativa.
 *
 */

public class ExercicioPagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String nome;
		double valorPorHora;
		int horasTrabalhadas;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Funcionário:");
		nome = scanner.nextLine();
		System.out.println("Digite o Valor da Hora de Trabalho do Funcionário:");
		valorPorHora = scanner.nextDouble();
		System.out.println("Digite Quantas Horas o Funcionário Trabalhou:");
		horasTrabalhadas = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("O Pagamento para %s Deve ser R$ %.2f .", nome, horasTrabalhadas*valorPorHora );
	}
}
