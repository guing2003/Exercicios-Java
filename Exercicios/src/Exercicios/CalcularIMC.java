package Exercicios;
//desenvolva uma aplicação para caçlcular o imc de uma pessoa

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		// variaveis
		double peso, altura, imc;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada
		System.out.print("Digite o peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite a altura: ");
		altura = teclado.nextDouble();

		// processamento
		imc = peso / (altura * altura);

		// saida
		System.out.println("O IMC desta pessoa é: " + formatador.format(imc));
		
		//classificação
		if (imc < 18.5) {
			System.out.println("Abaixo do peso!");
		} else if (imc <= 24.9) {
			System.out.println("Peso ideal!");
		} else if (imc < 29.9) {
			System.out.println("Levemente acima do peso!");
		} else if (imc < 34.9) {
			System.out.println("Obesidade grau 1!");
		} else if (imc < 39.9) {
			System.out.println("Obesidade grau 2(severa)!");
		} else{
			System.out.println("Obesidade grau 3(morbida)!");
		}
		teclado.close();
	}
}
