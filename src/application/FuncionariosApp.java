package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/**
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
 * mostrar novamente os dados do funcionário. Use a classe projetada ao lado.
 */

public class FuncionariosApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.println("Nome:");
		funcionario.setName(scanner.next());
		System.out.println("Salário Bruto:");
		funcionario.setGrossSalary(scanner.nextDouble());
		System.out.println("Imposto:");
		funcionario.setTax(scanner.nextDouble());
		
		System.out.println("Funcionario:\n> " 
						   + funcionario);
		
		System.out.println("Qual a Porcentagem para Aumentar o Salário?");
		funcionario.increaseSalary(scanner.nextDouble());
		
		scanner.close();
		
		System.out.println("Dados Atualizados:\n> " 
				   + funcionario);
	}
}
