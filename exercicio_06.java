// Faça um programa que peça dois números e mostre a soma deles. 

package exercicios01;

import java.util.Scanner; 

public class exercicio_06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 

		double num1; 
		double num2; 
		double soma; 

		System.out.println("Primeiro número: ");
		num1 = entrada.nextDouble(); 
		
		System.out.println("Segunda número: "); 
		num2 = entrada.nextDouble(); 
		
		soma = (num1 + num2); 
		
		System.out.println("Resultado da soma = " + soma); 
		
	}

}
