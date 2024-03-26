/* Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada
do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos
cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.
*/
package tarefa08;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resposta = "SIM".toUpperCase();
		String nome;
		float largura = 0;
		float comprimento = 0;
		float soma = 0;
		
		while ((resposta.equals("SIM")||(resposta.equals("S"))) ) {
			System.out.println("Insira o nome do cômodo escolhido, sem espaços:");
			nome = sc.next();
			
			System.out.println("Agora insira a largura do(a) " + nome);
			largura = sc.nextFloat();
			
			System.out.println("Por último, favor colocar o comprimento do(a) " + nome);
			comprimento = sc.nextFloat();
			
			System.out.println("A área do seu cômodo é de " + largura * comprimento + " metros quadrados.");
			
			soma += largura * comprimento;
			
			System.out.println("Gostaria de adicionar mais um cômodo? (Sim/Não)");
			resposta = sc.next().toUpperCase();
			
			
			}
		System.out.println("A área total da sua residência é de " + soma + " metros quadrados!");
		sc.close();
		}
}