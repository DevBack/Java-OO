package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao 
 * percorrer tal distância. Seu programa deve mostrar o consumo médio do carro, com três casas decimais.
 *
 */

public class ExercicioConsumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double distanciaPercorrida;
		double combustivelGasto;
		double consumo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Distância Percorrida:");
		distanciaPercorrida = scanner.nextDouble();
		System.out.println("Digite o Combustível Gasto:");
		combustivelGasto = scanner.nextDouble();
		
		scanner.close();
		
		consumo = distanciaPercorrida/combustivelGasto;
		System.out.printf("Consumo Médio: %.3f .", consumo);
	}
}
