package Exercicios;
//desenvolva uma aplicação no console para calcular o valor da tabuada

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// variaveis
		int numero;

		// objetos
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o numero da tabuada que você deseja: ");
		numero = teclado.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

}
