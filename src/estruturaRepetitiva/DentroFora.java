package estruturaRepetitiva;

import java.util.Scanner;

/**
 	Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
	Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo.
 */

public class DentroFora {

	public static void main(String[] args) {
		
		int numero, valor, dentro = 0, fora = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos Números Você vai Digitar?");
		numero = scanner.nextInt();
		
		for (int i=1; i<=numero; i++) {
			
			System.out.println("Digite um Número:");
			valor = scanner.nextInt();
			
			if (valor>=10 && valor<=20) {
				dentro++;
			}
			else {
				fora++;
			}
		}
		scanner.close();
		System.out.printf("DENTRO: %d\n"
						+ "FORA: %d\n", dentro, fora);
	}
}
