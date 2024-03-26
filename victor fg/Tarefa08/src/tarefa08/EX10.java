/* Elaborar um programa que apresente os resultados da soma e
 * da média aritmética dos valores pares situados na faixa numérica de 50 a 70.
*/
package tarefa08;

public class EX10 {
	public static void main(String[] args) {
		
		int contador = 50;
		float soma = 0;
		
		while (contador <= 70) {
			if (contador %2 == 0) {
			soma += contador;
			contador++;
			}
			else {
				contador++;
			}
		}
		System.out.println("A soma dos números pares na faixa de 50 a 70 é: " + soma + " e a média aritmética deles é " + soma/10);
		
		}
}