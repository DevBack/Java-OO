package struturasequencial;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/** 
 * 	Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
 *	nomes e a idade média entre essas pessoas, com uma casa decimal.
 */

class Pessoa{
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}

public class ExercicioIdades {

	public static void main(String[] args) {
		
	// Define a localidade padrão durante a execução do código. (Permite que o ponto flutuante seja representado pelo caracter "."(ponto).
		Locale.setDefault(Locale.US);
		
		String nome;
		int idade;
		double media = 0.0;
		List<Pessoa> pessoas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 2; ++i){
			
			System.out.println("Digite o Nome:");
            nome = scanner.nextLine();
            System.out.println("Digite a Idade:");
            idade = Integer.parseInt(scanner.nextLine());
            
            media = (media + idade)/i;
            
            pessoas.add(new Pessoa(nome, idade)); 
		}
		
		scanner.close();
		
		for(Pessoa pessoa : pessoas){
			int index = pessoas.indexOf(pessoa)+1;
			
			System.out.println("\n"
					+ "DADOS DA PESSOA "+ index +":\n"
					+ "NOME: "+ pessoa.nome +";\n"
					+ "IDADE: "+ pessoa.idade +";");
		}
		
		System.out.printf("\n A Média de Idade Entre %s e %s é de %.1f.\n", pessoas.get(0).nome, pessoas.get(1).nome, media);
	}
}
