package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. O programa deve ler o preço unitário do 
 * produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). 
 * Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
 * 
 */

public class ExercicioTroco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double preco;
		int quantidade;
		double valorRecebido;
		double troco;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Preço do produto:");
		preco = scanner.nextDouble();
		System.out.println("Digite a Quantidade:");
		quantidade = scanner.nextInt();
		System.out.println("Digite o Valor Recebido:");
		valorRecebido = scanner.nextDouble();
		
		scanner.close();
		
		troco = valorRecebido - (quantidade*preco);
		
		System.out.println("Preço Unitário do produto: "+ preco);
		System.out.println("Quantidade Comprada: "+ quantidade);
		System.out.println("Valor Recebido: "+ valorRecebido);
		System.out.println("TROCO: "+ troco);
	}
}
