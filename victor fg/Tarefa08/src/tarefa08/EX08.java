/* Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit,
 * de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
 * O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9*C +160) /5,
 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius
*/
package tarefa08;

public class EX08 {
	public static void main(String[] args) {
		int Celsius = 10;
		while (Celsius <=100) {
			int Fahrenheit = ((9*Celsius+160)/5);
			System.out.println("Sendo " + Celsius + " seu valor em Celsius, seu valor em Fahrenheit é: " + Fahrenheit);
			Celsius = Celsius + 10;
		}


	}
}