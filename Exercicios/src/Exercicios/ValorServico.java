package Exercicios;
//Desenvolva uma aplicação para calcular o valor de um servico

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		//variaveis
		double hora, remuneracao, custoOperacional, cargaHoraria;
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		//entrada
		System.out.print("Valor da remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Valor do custo operacional mensal: ");
		custoOperacional = teclado.nextDouble();
		System.out.print("Carga horaria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		
		hora = (remuneracao + (remuneracao * 0.3) + custoOperacional + (remuneracao * 0.2))/ cargaHoraria;
		
		//saida
		System.out.println("O valor da hora do servico é: R$ " + formatador.format(hora));
		
		teclado.close();

	}

}
