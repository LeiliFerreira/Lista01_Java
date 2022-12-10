// Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo 
// (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia 
// a vari�vel peso (peso de peixes) e calcule o excesso. Gravar na vari�vel excesso a quantidade de quilos al�m do 
// limite e na vari�vel multa o valor da multa que Jo�o dever� pagar. Imprima os dados do programa com as mensagens 
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
			System.out.println("N�o excedeu o limite!"); 
		} else {
			excedeu = (quilos - 50); 
			multa = (excedeu * 4); 
			System.out.println("Voc� excedeu " + excedeu + " kg"); 
			System.out.println("Multa � pagar: R$" + multa); 
		}
	}
}
