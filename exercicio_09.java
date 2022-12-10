// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
// tendo como dado de entrada a altura (h) de uma pessoa, 
// construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:

//   Para homens: (72.7*h) - 58
//   Para mulheres: (62.1*h) - 44.7 

package exercicios01;

import java.util.Scanner; 

public class exercicio_09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double altura; 
		double peso_ideal; 
		
		int sexo; 
		
		System.out.println("Digite a sua altura: "); 
		altura = entrada.nextDouble(); 
		
		System.out.println("Qual o seu sexo? 1 - homem / 2 mulher"); 
		sexo = entrada.nextInt(); 
		
		if (sexo == 1) {
			peso_ideal = (72.7 * altura) - 58; 
			System.out.printf("Seu peso ideal é %.4f%n" , peso_ideal); 
		} else if (sexo == 2) {
			peso_ideal = (62.1 * altura) - 44.7; 
			System.out.printf("Seu peso ideal é %.2f%n" , peso_ideal); 
		} 
	}
}
