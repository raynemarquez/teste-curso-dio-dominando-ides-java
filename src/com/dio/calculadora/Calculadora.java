package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro valor");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo valor");
		num2 = scan.nextDouble();
		
		double soma = soma(num1, num2);
		double subtracao = subtracao(num1, num2);
		double multiplicacao = multiplicacao(num1, num2);
		double divisao = divisao(num1, num2);
		
		System.out.println("Soma=" + soma);
		System.out.println("Subtracao=" + subtracao);
		System.out.println("Multiplicacao=" + multiplicacao);
		System.out.println("Divisao=" + divisao);
		
	}

	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtracao(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double divisao(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}
	
	
}
