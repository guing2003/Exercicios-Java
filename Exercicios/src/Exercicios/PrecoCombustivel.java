package Exercicios;
//desenvolva uma aplicação para calcular qual combustivel é mais vantajoso para abastecer um carro flex

import java.util.Scanner;

public class PrecoCombustivel {

	public static void main(String[] args) {
		// variaveis
		double alcool, gasolina;

		// objetos
		Scanner teclado = new Scanner(System.in);
		
		// entrada
		System.out.print("Qual o valor do alcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Qual o valor da gasolina");
		gasolina = teclado.nextDouble();
		
		//processamento/saida
		if(alcool < 0.7 * gasolina) {
			System.out.println("Abasteca com alcool!");
		}else {
			System.out.println("Abasteca com gasolina!");
		}
		teclado.close();

	}

}
