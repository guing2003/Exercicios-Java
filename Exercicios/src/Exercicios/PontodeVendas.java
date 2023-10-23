package Exercicios;
//Desenvolva uma aplicação de Ponto de vendas

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontodeVendas {

	public static void main(String[] args) {
		//variaveis
		double total, desconto, totalDesconto, valorPago, troco;
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.println("Desconto %: ");
		desconto = teclado.nextDouble();
		
		//Processamento 1
		totalDesconto = total - (desconto * total)/ 100;
		
		//saida 1
		System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
		
		//entrada 2
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		
		//processamento 2
		troco = valorPago - totalDesconto;
		
		//saida 2
		System.out.println("Troco: R$ " + formatador.format(troco));
		
		teclado.close();

	}

}
