package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 	Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
 *	números lidos. Em caso de empate, mostrar apenas uma vez.
 *
 */

public class MenorDeTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int n1,n2,n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número:");
		n1 = scanner.nextInt();
		System.out.println("Digite o Segundo Número:");
		n2 = scanner.nextInt();
		System.out.println("Digite o Terceiro Número:");
		n3 = scanner.nextInt();
		
		scanner.close();
		
		if ((n1<n2)&&(n1<n3)) {
			System.out.println("MENOR: "+ n1);
		}
		else if ((n2<n1)&&(n2<n3)) {
			System.out.println("MENOR: "+ n2);
		}
		else if ((n3<n1)&&(n3<n2)) {
			System.out.println("MENOR: "+ n3);
		}
		else {
			System.out.println("MENOR: "+ n1);
		}
	}
}
