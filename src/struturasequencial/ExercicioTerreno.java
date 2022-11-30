package struturasequencial;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro 
 * quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço 
 * do terreno, ambos com duas casas decimais.
 */

import java.util.Locale;
import javax.swing.JOptionPane;

public class ExercicioTerreno {

	public static void main(String[] args) {
		
	// Define a localidade padrão durante a execução do código. (Permite que o ponto flutuante seja representado pelo caracter "."(ponto).
		Locale.setDefault(Locale.US);
		
		double largura;
		double comprimento;
		double areaDoTerreno;
		
		double valorMetroQuadrado;
		double precoDoTerreno;
		
	// Entrada de dados utilizando interface gráfica.
		largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura do terreno:"));
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento do terreno:"));
		valorMetroQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Metro Quadrado:"));
		
		areaDoTerreno = largura*comprimento;
		precoDoTerreno = valorMetroQuadrado*areaDoTerreno;
		
	// Saida de dados utilizando interface gráfica.
		JOptionPane.showMessageDialog(null, "Área do Terreno: " + areaDoTerreno + "\n"
											+ "Preço do Terreno: " + precoDoTerreno);
	}
}
