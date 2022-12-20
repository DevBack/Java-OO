package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 	Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
	fatorial de N.
 */

public class Fatorial {

	public static void main(String[] args) {
		
		int n, fatorial;
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Digite o valor de N: ");
	    n = scanner.nextInt();

	    fatorial = 1;
	    for (int i=n; i>0; i--) {
	        fatorial = fatorial * i;
	    }

	    System.out.printf("FATORIAL = %d\n", fatorial);

		scanner.close();
	}
}
