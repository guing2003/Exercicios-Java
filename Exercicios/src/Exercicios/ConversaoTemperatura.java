package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		//double
		double c, f;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		System.out.println("Exercicio para converter temperatura de Celsius para Fahrenheit");
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		
		c = (5*(f-32))/9;
		
		System.out.println("A temperatura em celsius é: " + c + formatador.format(c) + "°C");
		
		teclado.close();

	}

}
