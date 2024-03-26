//2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

package tarefa08;

public class EX02 {
 public static void main (String [] args) {
	int numero = 1;
	int resposta = 0;
	
	
	while (numero < 101) {
		resposta = resposta + numero;
		numero ++;
		}
	System.out.println(resposta);
 }
 
}
