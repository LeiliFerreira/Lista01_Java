// Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. 
// Calcule e mostre o produto do dobro do primeiro com metade do segundo, 
// a soma do triplo do primeiro com o terceiro, 
// o terceiro elevado ao cubo. 

package exercicios01;

import java.util.Scanner; 

public class exercicio_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int num1; 
		int num2; 
		double num3; 

		double op1; 
		double op2; 
		double op3; 
		
		System.out.println("Digite o primeiro n�mero: "); 
		num1 = entrada.nextInt(); 
		
		System.out.println("Digite o segundo n�mero: "); 
		num2 = entrada.nextInt(); 
		
		System.out.println("Digite o terceiro n�mero: "); 
		num3 = entrada.nextDouble(); 
		
		op1 = (num1 * 2) * (num2 / 2); 
		op2 = (num1 * 3) + num3; 
		op3 = num3 * num3 *num3; 
		
		System.out.println("C�lculo 1: " + op1); 
		System.out.println("C�lculo 2: " + op2); 
		System.out.println("C�lculo 3: " + op3); 
	}
}
