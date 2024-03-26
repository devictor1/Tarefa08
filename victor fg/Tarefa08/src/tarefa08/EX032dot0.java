//3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

package tarefa08;

public class EX032dot0 {

public static void main(String[] args) {
	
	int número=1;
	int resposta=0;
	
	while (número<501) {
		if (número %2 == 0) {
			resposta=resposta+número;
		}
		número++;
	}
	System.out.println(resposta);
}

}
