// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.    
// Fórmula: C = 5 * ((F-32) / 9). 

package exercicios01;

import java.util.Scanner; 

public class exercicio_07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 

		double F; 
		double C; 
		
		System.out.println("Insira a temperatura em Fahrenhei: "); 
		F = entrada.nextDouble(); 
		
		C = 5 * ((F - 32) / 9); 
		
		System.out.printf("Temperatura convertida em Celsius: %.2f%n" , C); 
	}
}
