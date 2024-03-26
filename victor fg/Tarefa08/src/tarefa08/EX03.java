//3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

package tarefa08;

public class EX03 {
	public static void main(String[] args) {
		int numero = 1;
		int resposta = 0;

		while (numero < 251) {
			int guardar = numero;
			numero = numero * 2;
			resposta = resposta + numero;
			numero = guardar;
			numero++;
		}
		System.out.println(resposta);

	}

}
