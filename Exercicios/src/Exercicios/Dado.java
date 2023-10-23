package Exercicios;

import java.util.Random;
import java.util.Scanner;

//desenvolva um aplicativo no console para fazer o lançamento de um dado de 6 faces, 
//exbindo a face que foi sorteada, logo apos a exibição a aplicação deve perguntar 
//se o jogador que jogar o dado novamente
public class Dado {

	public static void main(String[] args) {
		// variaveis
		int face;
		char opcao = 's';

		// objetos
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		while (opcao == 's' || opcao == 'S') {
			// gerando o numero aletaorio que representa a face
			face = aleatorio.nextInt(6) + 1;
			System.out.println("A face do dado apos jogalo é: " + face);
			
			// validar se o usuario quer jogar o dado novamente
			System.out.println("Deseja jogar o dado novamente? [S|N]");
			opcao = teclado.next().charAt(0);
		}
		teclado.close();
	}
}
