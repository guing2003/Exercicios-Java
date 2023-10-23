package Exercicios;
//desenvolva uma aplicação no console para calcular o valor da porcentagem usando regra de 3

import java.text.DecimalFormat;
import java.util.Scanner;

public class PorcentagemDeTres {

	public static void main(String[] args) {
		//variaveis
		double x, y, valor;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entradas
		System.out.print("Digite o valor de X: ");
		x = teclado.nextDouble();
		
		System.out.print("Digite o valor de Y: ");
		y = teclado.nextDouble();
		//processamento
		valor  =(x*y)/ 100;
		//saida
		System.out.println(x  + "% de " + y + " = " + formatador.format(valor));
		
		teclado.close();
	}

}
