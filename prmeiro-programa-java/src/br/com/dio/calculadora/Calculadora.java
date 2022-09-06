package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o próximo valor");
		b = scan.nextInt();
		
		
		int soma = soma(a,b);
		int subr = subr(a,b);
		int mult = mult(a,b);
		int divi = divi(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subr " + subr);
		System.out.println("mult " + mult);
		System.out.println("divi " + divi);
		
	}
	public static int soma(int a, int b) {
		return a+b;
	}
	public static int subr(int a, int b) {
		return a-b;
	}
	public static int mult(int a, int b) {
		return a*b;
	}
	public static int divi(int a, int b) {
		return a/b;
	}

}

