// Programa que calcula a idade do usuário.

package exercicios01;

import java.util.Scanner; 
import java.time.YearMonth; 

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String nome; 
		int ano_nascimento; 
		int ano_atual = YearMonth.now().getYear(); 
		int idade; 
		
		System.out.println("Qual o seu nome?"); 
		nome = entrada.nextLine(); 
		
		System.out.println("Em que ano você nasceu?"); 
		ano_nascimento = entrada.nextInt(); 
		
		idade = (ano_atual - ano_nascimento); 
		
		System.out.println(nome + " você tem " + idade + " anos."); 
	}
}
