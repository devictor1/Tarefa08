/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base,
e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
*/

package tarefa08;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Por favor insira a base");
		int B = sc.nextInt();
		
		System.out.println("Agora, por favor insira o expoente que irá decrescer");
		int E = sc.nextInt();
		
		while (E >= 0) {
		double resultado = Math.pow(B, E);
		
		System.out.println("O número base " + B + " elevado ao expoente " + E + " é igual a " + resultado);
		
		E--;
		
		}
		sc.close();
	}
}