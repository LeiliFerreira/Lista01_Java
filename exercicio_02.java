// Programa que calcula a média de 2 notas escolares. 

package exercicios01;

import java.util.Scanner; 

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String nome; 
		double nota1; 
		double nota2; 
		double  media; 
		
		System.out.println("Nome do aluno: "); 
		nome = entrada.nextLine(); 
		
		System.out.println("Digite a primeira nota: "); 
		nota1 = entrada.nextFloat(); 
		
		System.out.println("Digite a segunda nota: "); 
		nota2 = entrada.nextFloat(); 
		
		media = (nota1 + nota2) / 2; 
		
		System.out.println("Aluno(a): " + nome); 
		System.out.println("Média: " + media); 
	}
}
