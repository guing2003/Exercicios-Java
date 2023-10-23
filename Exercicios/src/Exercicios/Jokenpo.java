package Exercicios;
//desenvolva o jogo pedra papel tesoura

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		// variaveis
		int jogador, computador;

		// objetos
		Scanner teclado = new Scanner(System.in);

		// escolher a opção do jogador
		System.out.println("Jokenpô");
		System.out.println("1-Pedra");
		System.out.println("2-Papel");
		System.out.println("3-Tesoura");
		System.out.println("Digite a opção desejada: ");

		jogador = teclado.nextInt();
		System.out.println("");

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção invalida!!");
			break;
		}
		// computador
		Random comput = new Random();
		int opcaoComputador = comput.nextInt(3) + 1;

		switch (opcaoComputador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		// vencedor
		if (jogador == opcaoComputador) {
			System.out.println("Empate");
		} else {
			if (((jogador == 1 && opcaoComputador == 3) || jogador == 2 && opcaoComputador == 1)
					|| jogador == 3 && opcaoComputador == 2) {
				System.out.println("Jogador ganhou!!");
			} else {
				System.out.println("Computador venceu!!");
			}
		}
		teclado.close();
	}
}
