/* Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final
 * o total do somatório e a média aritmética dos valores lidos.
*/
package tarefa08;

import java.util.Scanner;

public class EX09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int numero;
		float soma = 0;
		
		while (contador < 10) {
			System.out.println("Por favor insira um número!");
			numero = sc.nextInt();
			soma += numero;
			contador++;
		}
		System.out.println("A soma dos seus números é: " + soma + " e a média aritmética é " + soma/10);
		sc.close();
		}
}