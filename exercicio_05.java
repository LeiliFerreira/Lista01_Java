// Calcular a área de um quadrado. 
// Fórmula = área = base * altura

package exercicios01;

import java.util.Scanner; 

public class exercicio_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 

		int area; 
		int base; 
		int altura; 
		
		System.out.println("Insira o valor da base: "); 
		base = entrada.nextInt(); 
		
		System.out.println("Insira o valor da altura: "); 
		altura = entrada.nextInt(); 
		
		area = (base * altura); 
		
		System.out.println("Área = " + area); 
	}
}
