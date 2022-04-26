/******************************************************************************

Olá!
Esse código foi feito por mim (Amanda Brito), como um pequeno projeto de uma calculadora inteligente.
Note que adicionei diversos comentários para que seja de fácil entendimento para todos.
Bons estudos! :)

*******************************************************************************/

import java.util.Scanner; //Importando o Scanner

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner ler = new Scanner(System.in); //Instanciando e criando um objeto Scanner
		int a, b;   //Declarando váriaveis a e b
		
		System.out.printf("Bem vindo(a) a calculadora inteligente!\n"); //Imprimindo na tela a mensagem de boas vindas
		
		System.out.printf("Digite o primeiro valor: "); //Imprimindo a solicitação da entrada do usuario
		a = ler.nextInt();  //Lendo um valor inteiro
		
		System.out.printf("Digite o segundo valor: "); //Imprimindo a solicitação da segunda entrada do usuario
		b = ler.nextInt(); //Lendo um valor inteiro
		
		System.out.printf("\nResultado da soma:\n"); //Imprimindo na tela a mensagem de resultado
		System.out.printf("%d + %d = %3d", a,b, (a + b)); //Imprimindo na tela a soma, juntamente com o resultado
		
		System.out.printf("\nResultado da subtração:\n"); //Imprimindo na tela a mensagem de resultado
		System.out.printf("%d - %d = %3d", a,b, (a - b)); //Imprimindo na tela a subtração, juntamente com o resultado
		
		System.out.printf("\nResultado da divisão:\n"); //Imprimindo na tela a mensagem de resultado
		System.out.printf("%d / %d = %3d", a,b, (a / b)); //Imprimindo na tela a divisão, juntamente com o resultado
		
		System.out.printf("\nResultado da multiplicação:\n"); //Imprimindo na tela a mensagem de resultado
		System.out.printf("%d * %d = %3d", a,b, (a * b)); //Imprimindo na tela a multiplicação, juntamente com o resultado
		
		System.out.printf("\nObrigado(a) por utilizar a calculadora inteligente! Até"); //Imprimindo na tela mensagem de finalização
	}
}
