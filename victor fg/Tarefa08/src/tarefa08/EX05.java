/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15.
 * Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio.
 * Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
*/

package tarefa08;

public class EX05 {
	public static void main(String[] args) {
		int numero = 0;

		while (numero < 15) {
			int resultado = (int) Math.pow(3, numero);
			System.out.println("O número 3 elevado a " + numero + " é igual a " + resultado);
			numero++;

		}

	}
}