package estruturaRepetitiva;

import java.util.Scanner;

/**
 * 
 * 	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
 *	senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
 *	for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
 *	encerrado. Considere que a senha correta é o valor 2002.
 *
 */

public class SenhaFixa {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Senha:");
		senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida! Tente Novamente:");
			senha = scanner.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		scanner.close();
	}
}
