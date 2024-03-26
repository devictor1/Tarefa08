/* Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
 * seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
*/
package tarefa08;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor insira um número!");
		int numero = sc.nextInt();
		
		int maiorNumero = numero;
		int menorNumero = numero;
		
		
		while (numero >= 0)  {
			System.out.println("Por favor insira outro número!");
			numero = sc.nextInt();
			if (maiorNumero < numero) {
				maiorNumero = numero;
			}
			if (menorNumero > numero) {
				menorNumero = numero;
			}
			}
		System.out.println("O programa será encerrado pois um número negativo foi inserido!");
		System.out.println("Dentre os números informados, maior é " + maiorNumero + ", e o menor é "+ menorNumero);
		sc.close();
		}
}