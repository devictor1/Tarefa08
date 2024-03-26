//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

package tarefa08;

public class EX01 {
 public static void main (String [] args) {
	int numero = 4;
	int multiplicador = 1;
	
	while (multiplicador < 11) {
		System.out.print(numero * multiplicador + " ");
		multiplicador ++;
		
	}
 }
}
