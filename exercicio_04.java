// Pedir o valor da hora de trabalho de um funcioin�rio e o total de horas trabalhadas no m�s para mostrar o sal�rio total � receber.

package exercicios01;

import java.util.Scanner; 

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double valor_hora; 
		double quant_horas; 
		double salario; 
		
		System.out.println("Insira o valor da hora trabalhada: R$ "); 
		valor_hora = entrada.nextDouble(); 
		
		System.out.println("Insira a quantidade de horas trabalhadas no m�s: "); 
		quant_horas = entrada.nextDouble(); 
		
		salario = (valor_hora * quant_horas); 
		
		System.out.println("Sal�rio � receber: R$" + salario); 
	}
}
