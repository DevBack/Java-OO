package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. O programa deve ler o preço unitário do 
 * produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do 
 * troco a ser devolvido ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o valor restante.
 *
 */

public class TrocoVerificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double preco;
		int quantidade;
		double recebido;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o Preço do Produto:");
		preco = scanner.nextDouble();
		System.out.println("Informe a Quantidade:");
		quantidade = scanner.nextInt();
		System.out.println("Informe o Valor Recebido::");
		recebido = scanner.nextDouble();
		
		scanner.close();
		
		if ((quantidade*preco)<=recebido) {
			System.out.printf("TROCO: %.2f", recebido%(quantidade*preco));
		}
		else {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$:%.2f REAIS.", (quantidade*preco)-recebido);
		}
	}
}
