// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
// (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia 
// a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do 
// limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens 
// adequadas.

package exercicios01;

import java.util.Scanner; 

public class exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double quilos; 
		double excedeu; 
		double multa; 
		
		System.out.println("Insira a quantidade em kg: "); 
		quilos = entrada.nextDouble(); 
		
		if (quilos <= 50) {
			System.out.println("Não excedeu o limite!"); 
		} else {
			excedeu = (quilos - 50); 
			multa = (excedeu * 4); 
			System.out.println("Você excedeu " + excedeu + " kg"); 
			System.out.println("Multa à pagar: R$" + multa); 
		}
	}
}
