// Pedir o valor da hora de trabalho de um funcioinário e o total de horas trabalhadas no mês para mostrar o salário total à receber.

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
		
		System.out.println("Insira a quantidade de horas trabalhadas no mês: "); 
		quant_horas = entrada.nextDouble(); 
		
		salario = (valor_hora * quant_horas); 
		
		System.out.println("Salário à receber: R$" + salario); 
	}
}
