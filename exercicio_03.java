// Programa que ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro...
// casas decimais. 
// Fórmula da área: area = π . raio2

package exercicios01;

import java.util.Scanner; 
import java.util.Locale; 

public class exercicio_03 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in); 
		
		double area; 
		double valor_raio; 
		
		System.out.println("Digite o valor do raio: "); 
		valor_raio = entrada.nextFloat(); 
		
		area = 3.14 * (valor_raio * valor_raio); 
		
		System.out.printf("area = %.4f%n", area); 
	}
}
