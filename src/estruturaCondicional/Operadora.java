package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia 
 * de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 *
 */

public class Operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		final int FRANQUIA = 100;
		int consumo;
		double total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Total de Consumo em Minutos:");
		consumo = scanner.nextInt();
		
		scanner.close();
		
		if(consumo <= FRANQUIA) {
			total = 50.0;
			System.out.printf("Valor a Pagar: %.2f", total);
		}
		else {
			total = (((consumo-FRANQUIA)*2)+50.0);
			System.out.printf("Valor a Pagar: %.2f", total);
		}
	}
}
